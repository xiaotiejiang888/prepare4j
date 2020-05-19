package com.prepare4j.zmy.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i =0;i<10;i++){
            sss(students, i);
        }
        System.out.println(students.size());

        Map<String, Student> collect = students.stream().collect(Collectors.toMap(Student::getName, Function.identity()));

        collect.get("1").setName("22222");
        ArrayList<Student> students1 = new ArrayList<>(collect.values());
        System.out.println("111");
    }

    private static void sss(List<Student> students, int i) {
        Student student = new Student(i + "");
        students.add(student);
    }
}
