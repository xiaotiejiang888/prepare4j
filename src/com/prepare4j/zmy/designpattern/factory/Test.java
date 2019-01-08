package com.prepare4j.zmy.designpattern.factory;

/**
 * 简单工厂模式或者说工厂模式的关注点并不在于在工厂中是如何生产出来需要的类的，而在于将创建产品与消费产品分离
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Fruit fruit0 = Gardener.getFruit("com.prepare4j.zmy.designpattern.factory.Apple");
        fruit0.grow();
        Fruit fruit1 = Gardener.getFruit("com.prepare4j.zmy.designpattern.factory.Grape");
        fruit1.harveset();
    }
}