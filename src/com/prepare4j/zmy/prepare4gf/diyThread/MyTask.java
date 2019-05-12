package com.prepare4j.zmy.prepare4gf.diyThread;

import java.util.concurrent.TimeUnit;

public class MyTask implements Runnable{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}