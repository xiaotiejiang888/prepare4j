package com.prepare4j.zmy.lambda;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zmy"));
        list.add(new Student("wsl"));
        list.add(new Student("wsf"));
        list.add(new Student("lgm"));
        Map<String, Boolean> collect = list.stream().collect(Collectors.toMap(Student::getName, o -> Boolean.TRUE));
        System.out.println(collect.toString());
    }
}
