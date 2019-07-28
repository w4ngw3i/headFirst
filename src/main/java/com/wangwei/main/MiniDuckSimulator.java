package com.wangwei.main;

import com.wangwei.composition.beans.fly.FlyRocketPowered;
import com.wangwei.composition.beans.MallardDuck;
import com.wangwei.composition.beans.ModelDuck;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:08
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        ModelDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
