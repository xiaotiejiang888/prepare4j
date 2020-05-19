package com.prepare4j.zmy.proxymy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ZmyInvocationHandler implements InvocationHandler {

    private final Object target;

    /**
     * 这个地方可以传入任何一个接口的实现类
     * @param target
     */
    public ZmyInvocationHandler(Object target) {
        this.target = target;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("饭前祷告");
        Object result = method.invoke(target, args);
        System.out.println("饭后洗手");
        return result;
    }
}
