package com.wangwei.main.composite;

import com.wangwei.mode.composite.beans.*;

/**
 * @author: wangwei
 * @date: 2019-07-30 14:15
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
