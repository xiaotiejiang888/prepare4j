package com.prepare4j.zmy.datastructure;

/**
 * 插入排序   https://www.cnblogs.com/ysocean/p/7896269.html
 * 　直接插入排序基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
     插入排序还分为直接插入排序、二分插入排序、链表插入排序、希尔排序等等，这里我们只是以直接插入排序讲解，后面讲高级排序的时候会将其他的。
 */
public class InsertSort {
    /**
     * 　　插入排序性能分析：
     *
     * 　　在第一轮排序中，它最多比较一次，第二轮最多比较两次，一次类推，第N轮，最多比较N-1次。因此有 1+2+3+...+N-1 = N*（N-1）/2。
     *
     * 　　假设在每一轮排序发现插入点时，平均只有全体数据项的一半真的进行了比较，我们除以2得到：N*（N-1）/4。用大O表示法大致需要需要 O(N2) 时间级别。
     *
     * 　　复制的次数大致等于比较的次数，但是一次复制与一次交换的时间耗时不同，所以相对于随机数据，插入排序比冒泡快一倍，比选择排序略快。
     *
     * 　　这里需要注意的是，如果要进行逆序排列，那么每次比较和移动都会进行，这时候并不会比冒泡排序快。
     * @param array
     * @return
     */
    public static int[] sort(int[] array){
        int index;
        //从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for(int i = 1 ; i < array.length ; i++){
            int tmp = array[i];//记录要插入的数据
            index = i;
            while(index > 0 && tmp < array[index-1]){//从已经排序的序列最右边的开始比较，找到比其小的数
                array[index] = array[index-1];//大的向后挪动
                index--;
            }
            array[index] = tmp;//存在比其小的数，插入
        }
        return array;
    }

    //遍历显示数组
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = sort(array);
        System.out.println("-----------------------");
        System.out.println("经过插入排序后的数组顺序为：");
        display(array);
    }
}