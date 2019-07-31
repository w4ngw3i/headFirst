package com.wangwei.mode.composite.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;

/**
 * @author: wangwei
 * @date: 2019-07-30 11:07
 */
public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("小葱半豆腐", "美味可口", true, 2.99);
        addItem("西红柿炒鸡蛋", "ljgl", false, 18);
        addItem("大盘鸡", "Pancakes with scrambledgsggss", true, 99);
        addItem("清炒小蘑菇", "Pancakesgsgs", true, 7.9);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full! can't add item to menu");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Autowired
    public Iterator createIterator(){
        return new DinerMenuIterator2(menuItems);
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
