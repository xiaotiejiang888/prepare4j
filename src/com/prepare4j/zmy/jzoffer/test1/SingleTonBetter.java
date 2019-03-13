package com.prepare4j.zmy.jzoffer.test1;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * 双检查锁方式
 * jdk中的java.lang.Runtime就是用的单例模式
 * 使用单例的好处
 * 1、控制资源的使用，通过线程同步来控制资源的并发访问
 * 2、控制实例的产生，已达到节约资源的目的
 * 3、控制数据的共享，在不建立直接关联的条件下，让多个不相关的进程或线程之间实现通信(可以在单例类中定义一些全局变量，多线程可以同时访问此全局变量，达到数据共享的目的。)
 */
public class SingleTonBetter {
    private static volatile SingleTonBetter singleTon1 = null;

    private SingleTonBetter() {
    }

    public static SingleTonBetter getInstance(){
        if (null == singleTon1){
            synchronized (SingleTonBetter.class){
                if (null == singleTon1){
                    singleTon1 = new SingleTonBetter();
                }
            }
        }
        return singleTon1;
    }
}
