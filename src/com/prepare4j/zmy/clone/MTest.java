package com.prepare4j.zmy.clone;

/**
 * https://www.cnblogs.com/nickhan/p/8569329.html
 */
public class MTest {
    /**
     * 浅拷贝：创建一个新对象，然后将当前对象的非静态字段复制到该对象，
     * 如果字段类型是值类型（基本类型）的，那么对该字段进行复制；
     * 如果字段是引用类型的，则只复制该字段的引用而不复制引用指向的对象。
     * 此时新对象里面的引用类型字段相当于是原始对象里面引用类型字段的一个副本，
     * 原始对象与新对象里面的引用字段指向的是同一个对象。
     *
     * 深拷贝:即将引用类型的属性内容也拷贝一份新的
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Person person = new Person(15, "zhangsan", new Address("四川", "天府二街"));

        Person clonePerson = (Person) person.deepClone();

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
