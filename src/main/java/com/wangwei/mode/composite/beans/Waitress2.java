package com.wangwei.mode.composite.beans;

import java.util.Iterator;
import java.util.List;

/**
 * @author: wangwei
 * @date: 2019-07-30 11:24
 */
public class Waitress2<T> {
    private List<T> list;

    public Waitress2(List<T> list) {
        this.list = list;
    }

    public void printMenu(){
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()){
            Menu menu = (Menu) iterator.next();
            pringMenu(menu.createIterator());
        }
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
