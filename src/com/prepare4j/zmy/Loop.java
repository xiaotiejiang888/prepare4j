package com.prepare4j.zmy;

public class Loop {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            loop:for (int j = 0; j < 10; j++) {
                if (i == 3 && j == 4) {
                    continue loop;
                }
                System.out.print(i + "*" + j + "=" + i * j + "    ");
            }
            System.out.println();
        }
    }

}