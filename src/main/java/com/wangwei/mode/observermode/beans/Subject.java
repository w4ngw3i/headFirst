package com.wangwei.mode.observermode.beans;


/**
 * @author: wangwei
 * @date: 2019-07-29 00:16
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
