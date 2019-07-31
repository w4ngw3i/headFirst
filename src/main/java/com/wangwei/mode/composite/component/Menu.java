package com.wangwei.mode.composite.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: wangwei
 * @date: 2019-07-30 22:33
 */
public class Menu extends MenuComponent {

    List menuComponents = new ArrayList();

    private String name;

    private String desc;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDesc());
        System.out.println("-------------------------------------");

        Iterator iterator = menuComponents.iterator();

        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }


    @Override
    public String getDesc() {
        return desc;
    }


}
