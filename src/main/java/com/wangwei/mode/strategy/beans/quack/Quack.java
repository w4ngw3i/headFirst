package com.wangwei.mode.strategy.beans.quack;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:06
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
