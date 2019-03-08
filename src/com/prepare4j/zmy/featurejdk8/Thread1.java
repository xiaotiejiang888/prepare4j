package com.prepare4j.zmy.featurejdk8;

import java.util.Arrays;
import java.util.List;

public class Thread1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();

        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (String feature : features) {
            System.out.println("zmy Before Java8 "+feature);
        }
        System.out.println("------------------------------");
        features.forEach(n-> System.out.println(n));
        System.out.println("------------------------------");
        features.forEach(System.out::println);
        System.out.println("------------------------------");
    }
}
