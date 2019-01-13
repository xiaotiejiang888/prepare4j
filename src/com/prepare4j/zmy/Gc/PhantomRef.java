package com.prepare4j.zmy.Gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

/**
 * 虚引用也称为幽灵引用或者幻影引用，它是最弱的一种引用关系。
 * 一个对象是否有虚引用的存在，完全不会对其生存时间构成影响，也无法通过虚引用来取得一个对象实例。
 * 为一个对象设置虚引用关联的唯一目的就是能在这个对象被收集器回收时收到一个系统通知。
 * 在JDK 1.2之后，提供了PhantomReference类来实现虚引用。
 * ---------------------
 * 作者：行者路上
 * 来源：CSDN
 * 原文：https://blog.csdn.net/u012998254/article/details/81428621
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */
public class PhantomRef {
    public static class Referred {
        // Note! 如果这里重写了finalize方法,那么PhantomReference不会追加到ReferenceQueue中
//        @Override
        protected void finalize() throws Throwable {
            System.out.println("Referred对象被垃圾收集");
        }
    }

    public static void collect() throws InterruptedException {
        System.out.println("开始垃圾收集...");
        System.gc();
        System.out.println("结束垃圾收集...");
        Thread.sleep(2000);
    }

    /**
     * 执行结果
     * 创建一个虚引用--->
     * 开始垃圾收集...
     * 结束垃圾收集...
     * 你需要清理一些东西了
     * Done
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("创建一个虚引用--->");

        ReferenceQueue dead = new ReferenceQueue();
        Map<Reference, String> cleanUpMap = new HashMap<>();

        Referred strong = new Referred();
        PhantomReference<Referred> phantom = new PhantomReference<>(strong, dead);
        cleanUpMap.put(phantom, "你需要清理一些东西了");

        strong = null;
        PhantomRef.collect();

        Reference reference = dead.poll();
        if (reference != null) {
            System.out.println(cleanUpMap.remove(reference));
        } else {
            System.out.println("reference为空");
        }
        System.out.println("Done");
    }
}
