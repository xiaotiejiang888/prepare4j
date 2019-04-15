package com.prepare4j.zmy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
/**
 * Collections 测试RandomAccess随机访问速度
 */
        List<String> l = new ArrayList<String>();
        List<String> _l = new LinkedList<String>();
        for (int i = 0; i < 100000; i++) {
            l.add(String.valueOf(i));
            _l.add(String.valueOf(i));
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < l.size(); i++) {
            l.get(i);
        }
        System.out.println("count:" + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < _l.size(); i++) {
            _l.get(i);
        }
        System.out.println("count:" + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        for (Iterator<String> it = _l.iterator(); it.hasNext(); ) {
            it.next();
        }
        System.out.println("count:" + (System.currentTimeMillis() - startTime));
    }
}
