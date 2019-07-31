package com.wangwei.mode.composite.component;

import com.wangwei.mode.composite.beans.Menu;
import com.wangwei.mode.composite.beans.MenuItem;

import java.util.Iterator;

/**
 * @author: wangwei
 * @date: 2019-07-30 11:24
 */
public class Waitress3 {
    private MenuComponent allMenus;

    public Waitress3(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    private void pringMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDesc());
        }
    }
}
