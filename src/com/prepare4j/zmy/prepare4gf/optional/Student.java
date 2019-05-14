package com.prepare4j.zmy.prepare4gf.optional;

/**
 * 学生类
 */
public class Student {
    private String name;

    public Student() {
        super();
    }

    public Student(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
}