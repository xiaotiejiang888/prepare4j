package com.prepare4j.zmy.callabletest;

public class TestStatic {
    public static int i = 1;
    static {
        System.out.println("i" + i);
        i=2;
    }

    public TestStatic() {
        System.out.println("TestStatic construction method"+i);
    }

    public void say() {
        System.out.println("TestStatic say hello");
    }



    public void appendex(StringBuffer a, StringBuffer b) {
        a.append("a");
        b=a;
    }

    public static void main(String[] args) {
        TestStaticA test = new TestStaticA();
        new TestStatic();
        test.say();
        StringBuffer a = new StringBuffer("a");
        StringBuffer b = new StringBuffer("b");
        new TestStatic().appendex(a,b);
        System.out.println(a.toString()+":"+b.toString());
    }
}
