package com.prepare4j.zmy.prepare4gf;

public class ThreadWithoutName {
    public static void main(String[] args) {

        //订单模块
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("保存订单的线程");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                throw new NullPointerException();
            }
        });
//        },"testThread");

        //发货模块
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("保存收获地址的线程");
            }
        });
        threadOne.start();
        threadTwo.start();
    }
}
