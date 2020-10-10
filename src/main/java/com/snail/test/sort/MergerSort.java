package com.snail.test.sort;

/**
 * 归并排序
 */
public class MergerSort {

    public static void main(String[] args) {

    }


    public static void mergerSort(int[] data, int startIndex, int endIndex) {
        //递归实现的终止条件
        if (startIndex >= endIndex) {
            return;
        }
        int r = (startIndex + endIndex) / 2;
        mergerSort(data, startIndex, r);
        mergerSort(data, r + 1, endIndex);
        merge(data, startIndex, r,  endIndex);
    }

    public static void merge(int[] data, int startIndex, int mid, int endIndex) {

    }

}
