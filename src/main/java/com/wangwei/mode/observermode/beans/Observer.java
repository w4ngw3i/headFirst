package com.wangwei.mode.observermode.beans;

/**
 * @author: wangwei
 * @date: 2019-07-29 00:17
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
