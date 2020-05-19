package com.prepare4j.zmy.callabletest;

public class TestStaticA {
    static {
        System.out.println("b");
    }

    public TestStaticA() {
        System.out.println("TestStaticA construction method");
    }

    protected void say() {
        System.out.println("TestStaticA say hello ");
    }

    static {
        System.out.println("bb");
    }

}
