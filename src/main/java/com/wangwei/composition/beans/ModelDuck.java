package com.wangwei.composition.beans;

import com.wangwei.composition.beans.fly.FlyNoWay;
import com.wangwei.composition.beans.quack.Quack;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:12
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
