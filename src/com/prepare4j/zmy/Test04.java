package com.prepare4j.zmy;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        Integer i3 =new Integer(100);
        Integer i4 =new Integer(100);
        System.out.println("i3==i4: "+(i3==i4));//显示false
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
        list.add(9);
        System.out.println(list.toString());
    }
}
