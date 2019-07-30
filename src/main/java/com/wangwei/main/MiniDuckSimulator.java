package com.wangwei.main;

import com.wangwei.mode.strategy.beans.fly.FlyRocketPowered;
import com.wangwei.mode.strategy.beans.MallardDuck;
import com.wangwei.mode.strategy.beans.ModelDuck;

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
