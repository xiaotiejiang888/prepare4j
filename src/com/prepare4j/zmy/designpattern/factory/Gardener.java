package com.prepare4j.zmy.designpattern.factory;

public class Gardener {
    public static Fruit getFruit(String fruit) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        if ("apple".equalsIgnoreCase(fruit))
//        {
//            return new Apple();
//        }
//        else if ("grape".equalsIgnoreCase(fruit))
//        {
//            return new Grape();
//        }
//        else
//        {
//            return null;
//        }
        Class<?> aClass = Class.forName(fruit);
        return (Fruit)aClass.newInstance();
    }
}
