package com.chen;

public class Demo04 {
    public static void main(String[] args) {
        int d = add(50,60);
        System.out.println(d);
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void printArray(int[]arr){
        if (arr == null){
            System.out.println("null");
        }
        if (arr.length == 0){
            System.out.println("[]");
        }
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
        }

    }
}
