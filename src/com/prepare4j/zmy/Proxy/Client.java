package com.prepare4j.zmy.Proxy;

public class Client {
    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.work();
        System.out.println("-----------------------------");
        Target target1 = (Target) TargetProxy.getProxyObject(new TargetImpl());
        target1.work();
    }
}
