package com.wangwei.mode.composite.beans;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: wangwei
 * @date: 2019-07-30 15:28
 */
public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("美式咖啡", "很苦", true, 28);
        addItem("摩卡", "可加奶", false, 35);
        addItem("卡布奇诺", "泡沫多", true, 38);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
