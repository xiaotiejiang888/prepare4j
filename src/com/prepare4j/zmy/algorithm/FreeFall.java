package com.prepare4j.zmy.algorithm;

import java.util.Arrays;

public class FreeFall {
    public static void main(String[] args) {
        double currentheight = 100;
        int totalTimes = 8;
        double totalPath = currentheight;

        for (int ith = 1;ith<totalTimes;ith++){
            currentheight/=2;
            totalPath+=currentheight;
        }

        System.out.println("total path:"+totalPath+" 8th:"+currentheight);

    }
}
