package com.prepare4j.zmy.datastructure.binarytree;

public class ParamTest2 {
    public static void main(String[] args) {
        Student stu = new Student(80);
        raiseScore(stu);
        System.out.print(stu.getScore());
    }

    public static void raiseScore(Student s) {
        s.setScore(s.getScore() + 10);
    }
}
