package com.prepare4j.zmy.algorithm;

/**
 * 冒泡排序:小的在左边，大的在右边
 */
public class MaoPaoSort {
    public static void main(String[] args) {
//        int i = (int)(Math.random()*(100+1));
//        int j = (int)(Math.random()*(100+1));
//        int k = (int)(Math.random()*(100+1));
//        int a = (int)(Math.random()*(100+1));
//        int b = (int)(Math.random()*(100+1));
//        int c = (int)(Math.random()*(100+1));
        int[] l = {6,1,8,2,9,5};
        System.out.println("排序前:"+ toArray(l));
        sort1(l);
        System.out.println("排序后:"+ toArray(l));
    }
    public static String toArray(int[] l){
        String arrayPrint = "";
        for (int i = 0; i < l.length; i++) {
            int j = l[i];
            arrayPrint += j+" ";
        }
        return arrayPrint;
    }

    public static int[] sort1(int[] array) {
        //公共比5趟，第一趟比5次，第二趟4次
        boolean flag;
        /**
         * 第一次外层循环将最大（最小）的值放到最上面（数组最后面）；
         * 第二次外层循环把第二大（小）的值放到从上往下第2个位置：（数组最后一个）
         */
        for (int m = 0; m < array.length - 1; m++) {//控制比的趟数
            flag = true;//加入表示，提高效率 如果位置一直是对的就break；
            /**
             * 那么，每一次外层循环，内层的循环只需要循环从1到总长度减外层次数的长度
             */
            for (int n = 0; n < array.length - m - 1; n++) {//控制每趟比的次数
                if (array[n] > array[n + 1]) {
                    flag = false;
                    array[n] = array[n] + array[n + 1];
                    array[n + 1] = array[n] - array[n + 1];
                    array[n] = array[n] - array[n + 1];
                }
            }
            if (flag) {
                break;
            }
        }
        return array;
    }
}
