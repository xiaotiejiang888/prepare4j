package com.prepare4j.zmy.prepare4gf.optional;

/**
 * 年级类
 */
public class Grade {

    private Student student;

    public Grade() {
        super();
    }

    public Grade(Student student) {
        super();
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Grade [student=" + student + "]";
    }
}