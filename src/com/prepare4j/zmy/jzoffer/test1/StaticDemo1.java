package com.prepare4j.zmy.jzoffer.test1;

public class StaticDemo1 {

    public static void main(String[] args) {
        StaticDemo1 t1=new StaticDemo1();    //第2步，初始化构造函数，i=9
        System.out.println(t1.i);            //第3步，按顺序执行,9
        speak();                            //第4步，按顺序执行，调用静态函数

    }
    static int i=1;                            //静态变量存到静态区域。
    static void speak()                        //静态函数存到静态区域。调用时执行。
    {
        System.out.println("a");;
    }
    static {                                //第1步，静态代码块随着类的加载,优先执行且只执行一次。i=3，i+3打印结果是4。
        i=i+3;
        System.out.println(i);
    }

    public StaticDemo1(){                    //构造方法，初始化时执行。
        i=i+5;                                //i=9
        System.out.println(i);
    }
}
