package com.prepare4j.zmy.Proxy;

public class TargetImpl implements Target {
    @Override
    public void work() {
        System.out.println("我就只能做这么多了");
    }
}
