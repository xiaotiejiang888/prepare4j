package com.prepare4j.zmy.designpattern.Observer.v2;

import java.util.Observable;
import java.util.Observer;

/**
 * 创建一个主题
 */
public class Watcher implements Observer
{
    String data;

    public Watcher(Observable o)
    {
        o.addObserver(this);
    }

    public String getData()
    {
        return data;
    }

    public void update(Observable o, Object arg)
    {
        this.data = ((Watched)o).getData();
        System.out.println("状态发生改变：" + ((Watched)o).getData());
    }
}