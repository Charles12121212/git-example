package com.chen.test1;

import java.util.Scanner;

public class Rhombus1 {
    public static void main(String[] args) {
        //输入菱形行数
        System.out.println("输入菱形行数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //定义空格行数
        int space = num - 1;

        //打印上半部分
        for (int i = 1; i <= num; i++) {
            //打印空格
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            //打印菱形
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印下半部分
        space = 1;
        for (int i = num-1; i >= 0; i--) {
            //打印空格
            for (int j = space++; j > 0; j--) {
                System.out.print(" ");
            }
            //打印菱形
            for (int k = 0; k < 2*i -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
