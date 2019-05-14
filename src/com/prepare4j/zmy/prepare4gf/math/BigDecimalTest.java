package com.prepare4j.zmy.prepare4gf.math;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        int i = new BigDecimal("0.333").compareTo(new BigDecimal(0.333));
        System.out.println(i);
    }
}
