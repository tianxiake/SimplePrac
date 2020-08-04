package com.snail.test.sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * 从小到大排序
     *
     * @param a 待排序数组
     * @param n 排序数组的长度
     */
    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            //每次循环一次之后就排好了一位了。所以比较就少了i次所以是n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            //没有发生交换表示已经排序完成了
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 1, 8, 2};
        bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

}
