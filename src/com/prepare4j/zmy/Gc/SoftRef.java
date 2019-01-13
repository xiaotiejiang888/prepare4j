package com.prepare4j.zmy.Gc;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * 软引用是用来描述一些还有用但并非必需的对象。
 * 对于软引用关联着的对象，在系统将要发生内存溢出异常之前，将会把这些对象列进回收范围之中进行第二次回收。
 * 如果这次回收还没有足够的内存，才会抛出内存溢出异常。在JDK 1.2之后，提供了SoftReference类来实现软引用。
 */
public class SoftRef {
    public static void collect() throws InterruptedException {
        System.out.println("开始垃圾收集...");
        System.gc();
        System.out.println("结束垃圾收集...");
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("创建一个软引用--->");

        Referred strong = new Referred();
        SoftReference<Referred> soft = new SoftReference<Referred>(strong);

        SoftRef.collect();

        System.out.println("删除引用--->");

        strong = null;
        SoftRef.collect();

        System.out.println("开始堆占用");

        try {
            List<SoftRef> heap = new ArrayList<>(100);
            while (true) {
                heap.add(new SoftRef());
            }
        } catch (OutOfMemoryError e) {
            // 软引用对象应该在这个之前被收集
            System.out.println("内存溢出...");
        }

        System.out.println("Done");
    }
}
