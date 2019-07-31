package com.wangwei.mode.composite.beans;

import java.util.Iterator;

/**
 * @author: wangwei
 * @date: 2019-07-30 11:40
 */
public class DinerMenuIterator2 implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator2(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (menuItems[position-1] != null){
            for (int i=position-1; i<menuItems.length-1; i++){
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
