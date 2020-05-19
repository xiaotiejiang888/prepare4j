package com.prepare4j.zmy.Proxy;

public class Client3 {
    public static void main(String[] args) {
        Target target = (Target) TargetProxyTwo.getProxyObj(new TargetImpl(), new InterceptorImpl());
        target.work();
    }

}
