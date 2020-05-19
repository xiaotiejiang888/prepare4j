package com.prepare4j.zmy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TargetProxy implements InvocationHandler {

    private Object target;

    public TargetProxy(Object target){
        this.target = target;
    }

    /**
     *   缺点   代理需要做的事情不是很灵活。直接在这里面写死了。
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理在前面做事情了");
        try {
            return method.invoke(target, args);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    public static Object getProxyObject(Object target){
        return Proxy.newProxyInstance(
                //类加载器，主要作用是用来加载类的，把.class文件加载到jvm的方法区中，形成class对象
                target.getClass().getClassLoader()
                //实现的接口列表
                ,target.getClass().getInterfaces()
                //InvocationHandler 是一个接口，里面有且只有一个方法invoke(Object proxy, Method method, Object[] args)
                ,new TargetProxy(target)
        );
    }
}