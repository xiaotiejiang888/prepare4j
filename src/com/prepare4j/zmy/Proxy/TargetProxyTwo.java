package com.prepare4j.zmy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TargetProxyTwo implements InvocationHandler {
    private Object target;

    private Interceptor interceptor;

    public TargetProxyTwo(Object target, Interceptor interceptor) {
        this.target = target;
        this.interceptor = interceptor;
    }

    /**
     *
     * @param proxy 当前对象，即生成的代理对象
     * @param method 当前被调用的方法，即目标方法
     * @param args Object[] args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MethodName methodName = this.interceptor.getClass().getAnnotation(MethodName.class);
        if (methodName == null) {
            throw new NullPointerException("拦截器注解方法名字为空");
        }
        String name = methodName.value();
        if (name.equals(method.getName())) {
            return interceptor.intercept(new Invocation(target, method, args));
        }
        return method.invoke(target, args);
    }

    public static Object getProxyObj(Object target,Interceptor interceptor){
        return Proxy.newProxyInstance(
                //类加载器，主要作用是用来加载类的，把.class文件加载到jvm的方法区中，形成class对象
                target.getClass().getClassLoader(),
                //实现的接口列表
                target.getClass().getInterfaces(),
                //InvocationHandler 是一个接口，里面有且只有一个方法invoke(Object proxy, Method method, Object[] args)
                new TargetProxyTwo(target, interceptor));
    }
}
