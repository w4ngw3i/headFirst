package com.wangwei.mode.strategy.beans.fly;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:13
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
