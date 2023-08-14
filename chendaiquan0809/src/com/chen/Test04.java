package com.chen;

import java.util.Scanner;

/*
Integer类中有如下方法：
public static int parseInt(String s)
作用是将字符串类型的数字解析为整数值，要求字符串的第一个字符可以是正负符号（正号可以省略），其他字符必须为数字字符。
请设计方法自己实现这个功能。方法的参数为字符串类型，（要求同上，无需校验，正确输入即可），返回值为整数。
格式如下：
public static int stringToInt(String s) {
}
实现后在主方法中调用测试。
测试用例1:
参数："365"，返回整数： 365
测试用例2:
参数："+365"，返回整数： 365
测试用例3:
参数："-365"，返回整数： -365
测试用例4:
参数："00365"，返回整数： 365
测试用例5:
参数："-00365"，返回整数： -365
 */
public class Test04 {
    public static void main(String[] args) {
        //输入5次
        for (int i = 0; i < 5; i++) {
            //输入字符串
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入:");
            //类型为字符串
            String line = sc.nextLine();
            //转为int打印
            int num = stringToInt(line);
            System.out.println(num);
        }
    }

    public static int stringToInt(String s) {

        int result = Integer.valueOf(s);
        return result;

    }
}
