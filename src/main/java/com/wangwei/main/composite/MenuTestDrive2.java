package com.wangwei.main.composite;

import com.wangwei.mode.composite.beans.MenuItem;
import com.wangwei.mode.composite.component.Menu;
import com.wangwei.mode.composite.component.MenuComponent;
import com.wangwei.mode.composite.component.Waitress3;

/**
 * @author: wangwei
 * @date: 2019-07-30 14:15
 */
public class MenuTestDrive2 {
    public static void main(String[] args) {


        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =  new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        Menu allMenus = new Menu("ALL MENUS", "All menus combined");

        /*使用组合的add（）方法，将每个菜单都加入到顶层菜单allmenus中*/
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        /*加入菜单项*/
        dinerMenu.add(new MenuItem("pasta", "lajgljglagljgalj", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("apple pie", "apple pie with a flakey crust", true, 1.59));

        Waitress3 waitress3 = new Waitress3(allMenus);
        waitress3.printMenu();

    }
}
