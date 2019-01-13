package com.prepare4j.zmy.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");
        arrayList.add("444");
        System.out.println(arrayList);
        List<String> clone = (List<String>) ((ArrayList<String>) arrayList).clone();
        clone.add("555");
        System.out.println(arrayList);
        System.out.println(clone);
    }
}
