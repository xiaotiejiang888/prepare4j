package com.prepare4j.zmy.Gc;

/**
 * https://blog.csdn.net/u012998254/article/details/81428621
 * 强引用就是指在程序代码之中普遍存在的，类似“Object obj = new Object()”这类的引用，只要强引用还存在，垃圾收集器永远不会回收掉被引用的对象。
 */
public class StrongRef {

    public static void collect() throws InterruptedException {
        System.out.println("开始垃圾回收...");
        /**
         * System.gc()只是提醒虚拟机，程序员希望你在这回收一下对象，但回不回收还是虚拟机来决定，也就是说程序员对回不回收没有绝对的控制权
         * 所以说不建议大家反复用System.gc()，最好的解决办法就是，把不用的对象设置为null，便于虚拟机作出判断。
         */
        System.gc();
        System.out.println("结束垃圾回收.....");
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException{

        System.out.println("创建一个强引用---->");

        Referred strong = new Referred();

        StrongRef.collect();

        System.out.println("删去引用---->");

        strong = null;
        StrongRef.collect();
        System.out.println("done");
    }
}