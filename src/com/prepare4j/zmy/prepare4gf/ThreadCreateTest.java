package com.prepare4j.zmy.prepare4gf;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCreateTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println(Thread.currentThread().getName()+ " Before Java8, too much code for too little to do");
            }
        },"TimerTaskThread").start();
//        ExecutorService executorService = Executors.newFixedThreadPool(100);
//        Executors.newSingleThreadExecutor();
//        Executors.newCachedThreadPool();
//        Executors.newScheduledThreadPool(20);
    }
}
