package com.prepare4j.zmy.prepare4gf.optional;

/**
 * 空指针测试
 */
public class NpeTest {
    public String testNpe(School school) {
        String name = "";
        if(null != school) {
            Grade grade = school.getGrade();
            if(null != grade) {
                Student student = grade.getStudent();
                if(null != student) {
                    // 已经足够说明问题,所以name的判空老四没敲
                    name = student.getName();
                }
            }
        }
        return name;
    }
}