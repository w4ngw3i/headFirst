package com.wangwei.composition.beans.quack;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:07
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
