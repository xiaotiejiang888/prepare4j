package com.prepare4j.zmy.jzoffer.test1;

class StaticCode2{

    StaticCode2(){                        //没有调用。
        System.out.println("aa");
    }
    static{                                //1 静态代码块先执行
        System.out.println("x");
    }
    {                                    //2 对象的构造代码块。给对象初始化的。
        System.out.println("cc");
    }

    StaticCode2(int i){                    //3 被调用
        System.out.println("aa"+i);
    }
    public static void show(){                //静态方法，没有调用。
        System.out.println("gogogo");
    }
}

public class StaticDemo4 {
    public static void main(String[] args) {
        new StaticCode2(4);
    }

}