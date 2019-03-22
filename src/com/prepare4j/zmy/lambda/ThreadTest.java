package com.prepare4j.zmy.lambda;

public class ThreadTest {
    public static void main(String[] args) {
        //----------------before
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        }).start();
        //----------------now
        new Thread(
                ()-> System.out.println("Hello world")
        ).start();
    }
}
