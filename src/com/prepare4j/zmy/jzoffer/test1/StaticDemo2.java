package com.prepare4j.zmy.jzoffer.test1;

class StaticCode1{
    static{                                //第4步。由第3步触发。
        System.out.println("x");
    }
}

public class StaticDemo2 {
    static{                                //第1步。先加载主函数所在类，所以先加载并执行这段静态代码块。
        System.out.println("y");
    }
    public static void main(String[] args) {
        new StaticCode1();                //第3加载StaticCode1类。
        new StaticCode1();                //不执行。静态代码块只执行一次
        System.out.println("over");        //第5步。输出打印。
    }
    static{                                //第2步。多个静态代码块之前，按前后顺序执行
        System.out.println("z");
    }
}
