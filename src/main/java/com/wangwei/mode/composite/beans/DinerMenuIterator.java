package com.wangwei.mode.composite.beans;

/**
 * @author: wangwei
 * @date: 2019-07-30 11:40
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
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
}
