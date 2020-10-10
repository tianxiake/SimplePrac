package com.snail.test.sort;

import java.util.Arrays;

public class InsertSort {


    public static void insertSort(int[] a, int length) {
        if (length <= 1) {
            return;
        }
        for (int i = 1; i < length; i++) {
            //要插入的值
            int insertValue = a[i];
            //从已排序的区间倒序遍历
            int j = i - 1;
            for (; j >= 0; j--) {
                //如果遍历的值大于要插入的值就移动遍历的值
                if (a[j] > insertValue) {
                    a[j + 1] = a[j];
                } else {
                    //如果要插入的值小则遍历停止。
                    break;
                }
            }
            //注意这儿是j+1 就是要插入的值的位置
            a[j + 1] = insertValue;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 0, -1, 54, 8, 1, 0, 3, 3};
        insertSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
