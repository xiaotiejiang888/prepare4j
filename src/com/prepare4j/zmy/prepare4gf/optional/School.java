package com.prepare4j.zmy.prepare4gf.optional;

public class School {
    private Grade grade;

    public School() {
        super();
    }

    public School(Grade grade) {
        super();
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "School [grade=" + grade + "]";
    }
}
