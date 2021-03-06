package com.prepare4j.zmy.algorithm;

import java.util.Date;

/**
 * 二分法查找   要求数组是有序的
 */
public class DichotomySearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 };
        System.out.println(search(arr, 12));
        System.out.println(search(arr, 45));
        System.out.println(search(arr, 67));
        System.out.println(search(arr, 89));
        System.out.println(search(arr, 99));
        Date date1 = new Date();
        Date date2 = new Date();
        date1.compareTo(date2);
    }

    public static int search(int[] arr, int key) {
        int start =0;
        int end = arr.length - 1;
        while (start <= end){
            int middle = (start + end) / 2;
            if (key < arr[middle]) {
                end = middle - 1;
            } else if (key > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}