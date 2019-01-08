package com.prepare4j.zmy.designpattern.factory;

public class Grape implements Fruit {
    @Override
    public void grow() {
        System.out.println("Grape grow");
    }

    @Override
    public void harveset() {
        System.out.println("Grape harveset");
    }

    @Override
    public void plant() {
        System.out.println("Grape plant");
    }
}
