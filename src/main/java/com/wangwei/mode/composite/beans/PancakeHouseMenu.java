package com.wangwei.mode.composite.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: wangwei
 * @date: 2019-07-30 09:53
 * 煎饼屋菜单
 */
public class PancakeHouseMenu implements Menu{

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes with scrambledgsggss", true, 3.89);
        addItem("sgsdgssst", "Pancakesgsgs", true, 3.67);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
