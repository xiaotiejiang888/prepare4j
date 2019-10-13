package com.prepare4j.zmy.refactor.encapsulate_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
    private Set<Course> courses = new HashSet();

    public void addCourse(Course arg){
        courses.add(arg);
    }

    public void removeCourse(Course arg){
        courses.remove(arg);
    }

    public int getCoursesSize(){
        return courses.size();
    }

    /**
     * 只返回一个只读副本 用以确保没有任何一个用户能够通过取值函数修改集合
     * @return
     */
    public Set getCourse(){
        return Collections.unmodifiableSet(courses);
    }

    public int numOfCourses() {
        return courses.size();
    }

    public int numOfAdvancedCourses() {
        Iterator iterator = courses.iterator();
        int count = 0;
        while (iterator.hasNext()){
            Course next = (Course) iterator.next();
            if (next.getAdvanced()){
                count++;
            }
        }
        return count;
    }

}
