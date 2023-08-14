package com.chen1;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        //对输入的成绩做出等级判断
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个成绩:");
        int score = sc.nextInt();
        if (score <= 0 || score >= 100) {
            System.out.println("成绩正确");
        }else{
            System.out.println("成绩有误");
            if (score >= 90 && score <= 100) {
                System.out.println("游乐场玩一次");
            } else if (score >= 80 && score <= 90) {
                System.out.println("玩具一个");
            } else {
                System.out.println("胖揍一顿");
            }

        }
    }
}
