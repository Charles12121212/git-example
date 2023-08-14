package com.chen.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        int rows = 6;
        int spaces = rows - 1;

        // 打印上半部分
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        spaces = 1;
        // 打印下半部分
        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces++;
            for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
