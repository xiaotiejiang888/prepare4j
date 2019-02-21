package com.prepare4j.zmy.volatileandsynchronized;

class MyThread extends Thread {
    private volatile boolean isStop = false;
    public void run() {
        while (!isStop) {
            System.out.println("do something");
        }
    }
    public void setStop() {
        isStop = true;
    }
}