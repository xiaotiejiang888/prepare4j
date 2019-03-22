package com.prepare4j.zmy.lambda;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        List<Student> list = Arrays.asList(new Student("11"), new Student("22"), new Student("33"), new Student("44"));
        String collect = list.stream().map(Student::getName).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
