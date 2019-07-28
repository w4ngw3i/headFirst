package com.wangwei.composition.beans;

import com.wangwei.composition.beans.fly.FlyBehavior;
import com.wangwei.composition.beans.quack.QuackBehavior;

/**
 * @author: wangwei
 * @date: 2019-07-28 17:56
 */
public abstract class Duck {
    /*为行为接口类型声明两个引用变量，所有鸭子类都继承他们*/
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public abstract void display();

    public void performFly(){
        /*委托给行为类*/
        flyBehavior.fly();
    }

    public void performQuack(){
        /*委托给行为类*/
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
