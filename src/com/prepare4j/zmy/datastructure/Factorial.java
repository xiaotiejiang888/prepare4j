package com.prepare4j.zmy.datastructure;

/**
 * 递归
 */
public class Factorial {
    public static int getFactorial(int n){
        if(n >= 0){
            if(n==0){
                System.out.println(n+"!=1");
                return 1;
            }else{
                System.out.println(n);
                int temp = n*getFactorial(n-1);
                System.out.println(n+"!="+temp);
                return temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(4));
    }
}
