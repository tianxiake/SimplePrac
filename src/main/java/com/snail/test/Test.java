package com.snail.test;

public class Test {
    public static void main(String[] args) {

        try {
            String a = null;
            switch (a) {
                case "1":
                    break;
                default:
                    System.out.println("Hello");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
