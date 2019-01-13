package com.prepare4j.zmy.designpattern.singleton;

/**
 * 顾名思义，饿汉式，就是使用类的时候不管用的是不是类中的单例部分，都直接创建出单例类
 * 这就是饿汉式单例模式的写法，也是一种比较常见的写法。这种写法不会造成竞争，不会引发线程安全问题
 */
public class EagerSingleton
{
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton()
    {

    }

    public static EagerSingleton getInstance()
    {
        return instance;
    }
}