package com.chen.ZuoYe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {


        while (true){
            //调用getcode方法,用字符串s接住
            String s = getcode();
            System.out.println("获取的验证码为:" + s);
            //输入验证码,用字符串s1接住
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入验证码:");
            String s1 = sc.nextLine();
            if (s1.equalsIgnoreCase(s)){
                System.out.println("验证成功!");
                break;
            }else{
                System.out.println("输入有误,请重新输入!");
            }

        }

    }

    public static String getcode() {
        //建一个StringBuilder
        StringBuilder sb = new StringBuilder();
        //初始化字符串
        String s = "";
        //遍历
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            sb.append(i);
        }
        for (char i = '0'; i <= '9'; i++) {
            sb.append(i);
        }
        //将StringBuilder类型转为字符串
        String s1 = sb.toString();
        //随机取四个
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            int j = r.nextInt(sb.length());
            char c = s1.charAt(j);
            s += c;
        }
        return s;
    }


}
