package com.wangwei.mode.strategy.beans.fly;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:04
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying!!");
    }
}
