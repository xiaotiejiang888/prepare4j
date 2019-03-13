package com.prepare4j.zmy.jzoffer.test1;

/**
 * 饿汉 线程安全
 */
public class SingleTon1 {
    private static SingleTon1 singleTon1 = new SingleTon1();

    private SingleTon1() {
    }

    public static SingleTon1 getInstance(){
        return singleTon1;
    }
}
