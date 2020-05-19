package com.prepare4j.zmy.Proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface Interceptor {
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException;
}
