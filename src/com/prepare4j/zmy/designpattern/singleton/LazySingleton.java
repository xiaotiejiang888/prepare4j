package com.prepare4j.zmy.designpattern.singleton;

/**
 * https://www.cnblogs.com/xrq730/p/4905711.html
 * 这个人比较懒，只有当单例类用到的时候才会去创建这个单例类
 */
public class LazySingleton
{
    private static LazySingleton instance = null;

    private LazySingleton()
    {

    }

    public static LazySingleton getInstance()
    {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}