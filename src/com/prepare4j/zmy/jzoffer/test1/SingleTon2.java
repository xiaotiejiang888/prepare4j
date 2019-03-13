package com.prepare4j.zmy.jzoffer.test1;

/**
 * 懒汉  线程不安全 加上synchronized后线程安全
 */
public class SingleTon2 {
    private static SingleTon2 singleTon1 = null;

    private SingleTon2() {
    }

    public static synchronized SingleTon2 getInstance(){
        return null == singleTon1?new SingleTon2():singleTon1;
    }
}
