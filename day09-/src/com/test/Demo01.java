package com.test;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(getJc(3));

    }

    public static int getJc(int n) {
        if (n <= 0){
            return 0;
        }
        //出口
        if (n == 1) {
            return n;
        }
        //规律
        return n * getJc(n - 1);
    }
}
