package com.prepare4j.zmy.proxymy;

/**
 * 动态代理就是要解决在不知道真实类的情况下依然能够使用代理模式的问题。
 * 第十行的new Wolf() 也可以换成new rabbit（） 或者任何一个接口实现类
 */
public class Client {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Animal proxy = new ZmyInvocationHandler(new Wolf()).getProxy();

//        Animal proxy = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(),
//                new Class[]{Animal.class},
//                new ZmyInvocationHandler(new Wolf()));
        proxy.eat();
    }
}
