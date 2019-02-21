package com.prepare4j.zmy.recursion;

public class Test {
    // 使用递归计算阶乘
    // 定义一个方法
    public static int recursion(int n){
        //如果n==1那么直接返回1,，否则就再次调用自己
        if(n==1){
            return 1;
        }else{
            return n*recursion(n-1);// 每调用一次n就减1
        }
    }
    public static void main(String[] args) {
        int a=recursion(5);//把返回结果赋值给a
        System.out.println(a);// 打印结果
    }
}
