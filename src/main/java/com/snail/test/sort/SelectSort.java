package com.snail.test.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    public static void selectSort(int[] a, int length) {
        if (length <= 0) {
            return;
        }
        for (int i = 0; i < length - 1; i++) {
            int minValue = a[i];
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < minValue) {
                    minValue = a[j];
                    minIndex = j;
                    System.out.println(minValue);
                }
            }
            a[minIndex] = a[i];
            a[i] = minValue;
        }
    }

    public static void main(String[] args) {

        int[] a = new int[]{0, 3,-1,-2, 2, 1};
        selectSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
