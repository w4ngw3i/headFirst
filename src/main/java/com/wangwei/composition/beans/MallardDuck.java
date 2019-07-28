package com.wangwei.composition.beans;

import com.wangwei.composition.beans.fly.FlyWithWings;
import com.wangwei.composition.beans.quack.Quack;

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
