package com.prepare4j.zmy.designpattern.factory.v2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * https://www.cnblogs.com/xrq730/p/4905578.html
 * 工厂方法模式在Java中的应用及解读 拿ThreadFactory举个例子
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        threadFactory.newThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        }).start();
        System.out.println("hello");
    }
}
