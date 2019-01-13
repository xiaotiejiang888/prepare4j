package com.prepare4j.zmy.clone;

/**
 * 浅拷贝测试
 */
public class MTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(15, "zhangsan", new Address("四川", "天府二街"));

        Person clonePerson = (Person) person.clone();

        System.out.println(person);
        System.out.println(clonePerson);

        System.out.println(person.display());
        System.out.println(clonePerson.display());

        clonePerson.setName("wangwu");
        clonePerson.setAge(20);
        Address address = clonePerson.getAddress();
        address.setStreet("天府四街");
        System.out.println(clonePerson.display());
        System.out.println(person.display());
    }
}
