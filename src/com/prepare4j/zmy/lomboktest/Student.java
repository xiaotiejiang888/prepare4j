package com.prepare4j.zmy.lomboktest;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by zhangzh on 2017/2/8.
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Student {

    private String name;
    private int age;
    private String male;
    private String studentNo;
}