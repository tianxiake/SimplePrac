package com.snail.test;

public class FindValueTest {

    public static void main(String[] args) {

    }

    public static int findValueIndex(String[] arrays, int n, String findValue) {
        if (arrays == null || n <= 0) {
            return -1;
        }
        int findMaxLength = n;
        if (arrays.length < n) {
            findMaxLength = arrays.length;
        }

        int i = 0;
        while (i < findMaxLength) {
            if (arrays[i].equals(findValue)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /**
     * 哨兵思路
     */
    public static int findValueIndexNode(String[] arrays, int n, String findValue) {
        if (arrays == null || n <= 0) {
            return -1;
        }
        int findMaxLength = n;
        if (arrays.length < n) {
            findMaxLength = arrays.length;
        }

        if (arrays[findMaxLength - 1].equals(findValue)) {
            return findMaxLength - 1;
        }
        String temp = arrays[findMaxLength - 1];
        arrays[findMaxLength - 1] = findValue;
        int i = 0;
        while (!arrays[i].equals(findValue)) {
            i++;
        }
        arrays[findMaxLength - 1] = temp;

        if (i != findMaxLength - 1) {
            return i;
        }
        return -1;
    }

}
