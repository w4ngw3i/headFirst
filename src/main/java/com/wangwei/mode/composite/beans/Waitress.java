package com.wangwei.mode.composite.beans;

import java.util.Iterator;

/**
 * @author: wangwei
 * @date: 2019-07-30 11:24
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator cafeMenuIterator = cafeMenu.createIterator();
        System.out.println("MENU\n---\nBREAKFAST");
        pringMenu(pancakeHouseMenuIterator);
        System.out.println("\nLUNCH");
        pringMenu(dinerMenuIterator);
        System.out.println("\nDINNER");
        pringMenu(cafeMenuIterator);
    }

    private void pringMenu(java.util.Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDesc());
        }
    }
}
