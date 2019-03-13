package com.prepare4j.zmy.jzoffer.test1;

public class StaticDemo5 {
    static int i=1;
    static{
        System.out.println("a");        //第1步。a。且只执行一次
        i++;                            //i=i+1，结果2
    }
    public StaticDemo5(){
        System.out.println("c");        //第2步。
        i++;                            //i=i+1，结果3
    }

    public static void main(String[] args) {
        StaticDemo5 t1=new StaticDemo5();
        System.out.println(t1.i);        //第3步。3

        StaticDemo5 t2=new StaticDemo5();    //第4步。c。第二次创建实例。static静态代码块不执行。
        System.out.println(t2.i);        //第5步。又执行了一次StaticDemo5()构造函数。4
    }
}