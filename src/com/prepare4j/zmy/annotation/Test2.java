package com.prepare4j.zmy.annotation;

public class Test2 {
    public static void main(String[] args)
    {
        User user = new User();

        user.setName("liang");
        user.setAge("1");

        System.out.println(UserCheck.check(user));
    }
}
