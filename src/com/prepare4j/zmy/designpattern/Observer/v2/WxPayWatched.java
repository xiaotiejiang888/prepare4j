package com.prepare4j.zmy.designpattern.Observer.v2;

import java.util.Observable;

/**
 * 创建一个被观察者
 *
 * Observable是被观察者的父类，也就是主题对象。这是一个线程安全的类，是基于Vector实现的。
 */
public class WxPayWatched extends Observable{
    private String data = "";

    public String getData(){
        return data;
    }

    public void setData(String data){
        if (!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
