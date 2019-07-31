package com.wangwei.mode.composite.beans;

import com.wangwei.mode.composite.component.MenuComponent;

/**
 * @author: wangwei
 * @date: 2019-07-30 09:48
 * 菜单项
 */
public class MenuItem extends MenuComponent {

    private String name;

    private String desc;

    private boolean vegetarian;

    private double price;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("  " + getName());
        if (isVegetarian()){
            System.out.println("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("    -- " + getDesc());
    }
}
