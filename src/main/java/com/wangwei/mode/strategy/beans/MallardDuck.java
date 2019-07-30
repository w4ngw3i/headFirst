package com.wangwei.mode.strategy.beans;

import com.wangwei.mode.strategy.beans.fly.FlyWithWings;
import com.wangwei.mode.strategy.beans.quack.Quack;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:09
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard duck");
    }
}
