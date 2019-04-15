package com.prepare4j.zmy.datastructure.binarytree;

public class BinaryTree {
    public static void main(String[] args) {
         int i =   getSt(88888);
        System.out.println("i = "+i);
    }

    private static int getSt(int i) {
        int a = 0;
        try {
            a = i/7/8/9/5;
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            a = 294;
            System.out.println("finally a="+a);
            return a;
        }
    }


}
