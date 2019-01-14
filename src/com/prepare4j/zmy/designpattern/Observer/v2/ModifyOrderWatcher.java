package com.prepare4j.zmy.designpattern.Observer.v2;

import java.util.Observable;
import java.util.Observer;

/**
 * 创建一个观察者
 */
public class ModifyOrderWatcher implements Observer{
    String data;

    public ModifyOrderWatcher(Observable o){
        o.addObserver(this);
    }

    public String getData(){
        return data;
    }
    @Override
    public void update(Observable o, Object arg){
        this.data = ((WxPayWatched)o).getData();
        System.out.println("支付状态发生改变：" + ((WxPayWatched)o).getData()+"，修改订单状态,todo");
    }
}