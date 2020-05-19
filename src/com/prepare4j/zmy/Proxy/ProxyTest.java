package com.prepare4j.zmy.Proxy;

import java.lang.reflect.Proxy;

/**
 * Proxy帮我们创建了动态代理类和代理类实例。
 * 方法的最终调用是分派到了MyInvocationHandler.invoke方法，打印出了调用的方法信息。
 */
public class ProxyTest {
    public static void main(String[] args) {
        //设置系统属性，把生成的代理类写入到文件
        //JDK动态代理技术是在运行时直接生成类的字节码，并载入到虚拟机执行的。这里不存在class文件的，所以我们通过设置系统属性，把生成的字节码保存到文件，用于后面进一步分析。
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        //Proxy.newProxyInstance(loader, classes, h)返回的对象是实现了指定接口的类对象
        /**
         * ClassLoader loader
         *
         * 类加载器，主要作用是用来加载类的，把.class文件加载到jvm的方法区中，形成class对象
         * Class<?>[] interfaces
         *
         * 实现的接口列表
         * InvocationHandler h
         *
         * InvocationHandler 是一个接口，里面有且只有一个方法invoke(Object proxy, Method method, Object[] args)，
         */
        MyIntf proxyObj = (MyIntf)Proxy.newProxyInstance(
                MyIntf.class.getClassLoader(),new Class[]{MyIntf.class},new MyInvocationHandler()
        );
        proxyObj.helloWorld();
    }
}
