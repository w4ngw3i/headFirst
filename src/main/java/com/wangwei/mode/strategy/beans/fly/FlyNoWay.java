package com.wangwei.mode.strategy.beans.fly;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:05
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I not cat Fly");
    }
}
