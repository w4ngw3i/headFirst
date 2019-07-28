package com.wangwei.composition.beans.quack;

import com.wangwei.composition.beans.quack.QuackBehavior;

/**
 * @author: wangwei
 * @date: 2019-07-28 18:06
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
