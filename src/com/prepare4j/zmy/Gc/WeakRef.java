package com.prepare4j.zmy.Gc;

import java.lang.ref.WeakReference;

/**
 * 弱引用也是用来描述非必需对象的，但是它的强度比软引用更弱一些，被弱引用关联的对象只能生存到下一次垃圾收集发生之前。
 * 当垃圾收集器工作时，无论当前内存是否足够，都会回收掉只被弱引用关联的对象。
 * 在JDK 1.2之后，提供了WeakReference类来实现弱引用。
 */
public class WeakRef {
    public static void collect() throws InterruptedException {
        System.out.println("开始垃圾收集...");
        System.gc();
        System.out.println("结束垃圾收集...");
        Thread.sleep(2000);
    }

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("创建一个弱引用--->");

        Referred strong = new Referred();
        WeakReference<Referred> weak = new WeakReference<>(strong);

        WeakRef.collect();
        System.out.println("删除引用--->");

        strong = null;
        WeakRef.collect();

        System.out.println("Done");
    }
}
