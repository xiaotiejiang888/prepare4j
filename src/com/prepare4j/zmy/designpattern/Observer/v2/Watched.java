package com.prepare4j.zmy.designpattern.Observer.v2;

import java.util.Observable;

/**
 * 创建一个观察者
 */
public class Watched extends Observable
{
    private String data = "";

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        if (!this.data.equals(data))
        {
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
