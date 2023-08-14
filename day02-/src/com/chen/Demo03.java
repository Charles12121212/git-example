package com.chen;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        int x = 10;
        double y = x;
        System.out.println(y);
        double m = 2.5;
        int n = (int) m;//可能损失精度
        System.out.println(n);
        System.out.println(0x13c);
        /*
        1100100 -- 十进制
        sout
         */
        System.out.println(0b1101);
        System.out.println(0b11001000);

        System.out.println("hello" + 20.5);
        System.out.println(3 + 4 + "hello");
        System.out.println(3 + 4 + "hello" + 3 + 4);
        System.out.println(3 + 4 + "hello" + (3 + 4));
        int age = 18;
        System.out.println("我的年龄是:" + age);
        //在java中运算的
        System.out.println(10.0 / 3);
        System.out.println();
        System.out.println(11 % 2 == 0 ? "偶数" : "奇数");
        int a = 1;
        int b = 2;
        a += b;
        System.out.println(a);
    }
}
