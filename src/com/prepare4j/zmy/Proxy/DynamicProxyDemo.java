package com.prepare4j.zmy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        ClassLoader loader = DynamicProxyDemo.class.getClassLoader();
        Class[] classes = {Human.class, Car.class};
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("来了，老弟~");
                return null;
            }
        };

        Human human = (Human) Proxy.newProxyInstance(loader, classes, h);
        human.male();
        human.toString();
        human.getClass();
    }
}


interface Human {
    Object male();
}

interface Car {
    Object bmw();
}