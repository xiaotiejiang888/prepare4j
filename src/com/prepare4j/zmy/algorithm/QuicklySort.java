package com.prepare4j.zmy.algorithm;

/**
 * 快速排序：算法思想：基于分治的思想，是冒泡排序的改进型
 */
public class QuicklySort {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 15, 0, 6, 7, 2, 1, -5, 55};
        int middle = getMiddle(numbers, 0, numbers.length - 1); //将numbers数组进行一分为二
        sort(numbers, 0, middle - 1);   //对低字段表进行递归排序
        sort(numbers, middle + 1, numbers.length - 1); //对高字段表进行递归排序
        printArr(numbers);
    }

    public static void printArr(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");
    }

    /**
     * @param array
     * @param lo    指向起始位置
     * @param hi    指向末尾
     * @return
     */
    public static int getMiddle(int[] array, int lo, int hi) {
        //固定的切分方式
        /**
         * 　把整个序列看做一个数组，把第零个位置看做中轴，和最后一个比
         * ，如果比它小交换，比它大不做任何处理；交换了以后再和小的那端比
         * ，比它小不交换，比他大交换。这样循环往复，一趟排序完成
         * ，左边就是比中轴小的，右边就是比中轴大的，然后再用分治法
         * ，分别对这两个独立的数组进行排序。
         */
        int key = array[lo];//数组的第一个作为中轴
        while (lo < hi) {
            while (array[hi] >= key && hi > lo) {//从后半部分向前扫描
                hi--;
            }
            array[lo] = array[hi];
            while (array[lo] <= key && hi > lo) {//从前半部分向后扫描
                lo++;
            }
            array[hi] = array[lo];
        }
        array[hi] = key;
        return hi;
    }

    public static void sort(int[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int middle = getMiddle(array, lo, hi);
        sort(array, lo, middle - 1);
        sort(array, middle + 1, hi);
    }
}
