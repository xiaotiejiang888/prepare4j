package com.prepare4j.zmy.Gc;

public class Referred {

    /**
     * finalize方法，是java提供给程序员用来释放对象或资源的方法，但是尽量少用
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Referred对象被垃圾收集");
    }
}
