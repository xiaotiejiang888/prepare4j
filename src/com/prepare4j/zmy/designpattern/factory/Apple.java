package com.prepare4j.zmy.designpattern.factory;

public class Apple implements Fruit {
    @Override
    public void grow() {
        System.out.println("apple grow");
    }

    @Override
    public void harveset() {
        System.out.println("apple harveset");
    }

    @Override
    public void plant() {
        System.out.println("apple plant");
    }
}
