package com.prepare4j.zmy.prepare4gf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
//        removeByIterator(list,"2");
        removeByForeach(list,"4");
    }

    private static void removeByIterator(List<String> list,String i) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (i.equals(item)) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }

    private static void removeByForeach(List<String> list,String i) {
        for (String item : list) {
            if (i.equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list.toString());
    }
}
