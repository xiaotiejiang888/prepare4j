package com.prepare4j.zmy.refactor.encapsulate_collection;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.addCourse(new Course("数学",true));
        person.addCourse(new Course("语文",true));
        System.out.println(person.numOfAdvancedCourses());
    }
}
