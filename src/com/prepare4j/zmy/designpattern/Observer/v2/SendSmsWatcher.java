package com.prepare4j.zmy.designpattern.Observer.v2;

import java.util.Observable;
import java.util.Observer;

public class SendSmsWatcher implements Observer {
    String data;

    public SendSmsWatcher(Observable o) {
        o.addObserver(this);
    }

    public String getData(){
        return data;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.data = ((WxPayWatched)o).getData();
        System.out.println("支付状态发生改变：" + ((WxPayWatched)o).getData()+"，发送短信,todo");
    }
}
