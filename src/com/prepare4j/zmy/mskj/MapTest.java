package com.prepare4j.zmy.mskj;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        HashMap<Object, Object> map2 = new HashMap<>();
        map.put("1","zmy");
        map.put("2","yk");
        System.out.println(JSON.toJSONString(map));
        map2.putAll(map);
        System.out.println(JSON.toJSONString(map2));

        String a = "a,b,c;d、f";
        String[] split = a.split("[,，;；、]");
        System.out.println(split.toString());
    }
}
