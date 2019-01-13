package com.prepare4j.zmy.designpattern.singleton;

/**
 * 单例模式在Java中的应用及解读
 *
 * Runtime是一个典型的例子，看下JDK API对于这个类的解释"每个Java应用程序都有一个Runtime类实例，使应用程序能够与其运行的环境相连接，可以通过getRuntime方法获取当前运行时。应用程序不能创建自己的Runtime类实例。"，这段话，有两点很重要：
 *
 * 1、每个应用程序都有一个Runtime类实例
 *
 * 2、应用程序不能创建自己的Runtime类实例
 */
public class DoubleCheckLockSingleton
{
    private static DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton()
    {

    }

    /**
     * 线程A初次调用DoubleCheckLockSingleton.getInstance()方法，走12行，判断instance为null，进入同步代码块，此时线程切换到线程B，线程B调用DoubleCheckLockSingleton.getInstance()方法，由于同步代码块外面的代码还是异步执行的，所以线程B走12行，判断instance为null，等待锁。结果就是线程A实例化出了一个DoubleCheckLockSingleton，释放锁，线程B获得锁进入同步代码块，判断此时instance不为null了，并不实例化DoubleCheckLockSingleton。这样，单例类就保证了在内存中只存在一份。
     * https://www.cnblogs.com/xrq730/p/4905711.html
     * @return
     */
    public static DoubleCheckLockSingleton getInstance()
    {
        if (instance == null)
        {
            synchronized (DoubleCheckLockSingleton.class)
            {
                if (instance == null)
                    instance  = new DoubleCheckLockSingleton();
            }
        }
        return instance;
    }
}