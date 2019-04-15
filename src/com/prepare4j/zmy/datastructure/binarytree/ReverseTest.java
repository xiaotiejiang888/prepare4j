package com.prepare4j.zmy.datastructure.binarytree;

public class ReverseTest {
    public static void main(String[] args) {
        System.out.println(reverse("zmy"));
    }
    public static String reverse(String originStr){
        if (null == originStr || originStr.length() <= 1){
            return originStr;
        }
        return reverse(originStr.substring(1))+originStr.charAt(0);
    }
}
