package com.prepare4j.zmy.algorithm;

/**
 * 将矩阵从外向里以顺时针的顺序依次打印出每一个数字
 */
public class ClockwiseOutput { //顺时针打印一个矩阵
    public static void main(String[] args) {
        int[][] num = new int[4][4];
        int n = 4;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = count++;
            }
        }
        for (int i =0;i<num.length;i++){
            for(int j =0;j<num[i].length;j++){
                if (num[i][j] > 0){
                    System.out.print(num[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("===============");
        output(num, 0, n - 1);
    }

    public static void output(int[][] num, int start, int end) {
        if (start >= end || end <= 0)
            return;
        for (int i = start; i <= end; i++) {
            System.out.println(num[start][i]);
        }
        for (int i = start + 1; i <= end; i++) {
            System.out.println(num[i][end]);
        }
        for (int i = end - 1; i >= start; i--) {
            System.out.println(num[end][i]);
        }
        for (int i = end - 1; i > start; i--) {
            System.out.println(num[i][start]);
        }
        output(num, start + 1, end - 1);
    }
}