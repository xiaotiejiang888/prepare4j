package com.prepare4j.zmy.callabletest;

public class Tt {
    private static String str;
    private static int[] a;
    public static void main(String[] args) {
        str = "str";
        a = new int[]{1,2,3,4,5,6};
        change(str,a);
        System.out.println(str+"\t"+a[0]);
    }
    public static void change(String str,int[] array){
        str="change";
        array[0]=3;
    }
}
