package com.prepare4j.zmy.mskj;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        System.out.println(JSON.toJSONString(strings));
    }
}
