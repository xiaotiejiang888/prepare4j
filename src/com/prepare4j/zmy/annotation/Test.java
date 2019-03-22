package com.prepare4j.zmy.annotation;

public class Test {
    public static void main(String[] args) {
        User user = UserFactory.create();
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}
