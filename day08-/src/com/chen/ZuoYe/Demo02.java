package com.chen.ZuoYe;

import com.sun.javafx.embed.EmbeddedSceneDSInterface;

public class Demo02 {
    public static void main(String[] args) {

        String s = "hello world123hello world java123hi123hello54656hello world javase";
        int start = 0;
        int end = 0;
        int max = 0;
        //建一个StringBuilder
        StringBuilder sb = new StringBuilder();
        //遍历,给赋值
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            sb.append(i);
        }
        sb.append(' ');
        //将StringBuilder类型转为字符串,得到字符串
        String s1 = sb.toString();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //将字符串的
            char c = s.charAt(i);
            String s3 = String.valueOf(c);
            if (s1.indexOf(s3,0) != -1) {
                start++;
            }
            if (s1.indexOf(s3,0) == -1) {
                end++;
                start++;
            }
            int temp = start - end;
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
