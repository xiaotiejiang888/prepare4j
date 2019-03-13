package com.prepare4j.zmy.jzoffer.test1;

public class StaticDemo3 {
    public static void main(String[] args) {
    }
    static{                    //随类加载就执行，不需要实例化
        System.out.println("z");
    }
}
