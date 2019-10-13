package com.prepare4j.zmy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MyInvocationHandler
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * @param proxy 当前对象，即生成的代理对象
     * @param method 当前被调用的方法，即目标方法
     * @param args 方法传入的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method);
        return null;
    }
}
