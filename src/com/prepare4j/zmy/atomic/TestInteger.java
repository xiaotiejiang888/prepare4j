package com.prepare4j.zmy.atomic;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TestInteger {
    private static ExecutorService executor = Executors.newFixedThreadPool(10000);
    private static  int j = 0;
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10000);

        for (int i = 0;i<10000;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    j++;
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        System.out.println(j);
    }
}

