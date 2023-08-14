package com.chen.charnum;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
/*        //定义数组
        int[] arr = {1,2,3,4,5,6};
        //创建对象
        StringBuilder sb = new StringBuilder();
        //遍历字符串
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            //StringBuilder sb2 = sb.reverse();
        }
        sb.reverse();
        String str1 = sb.toString();
        System.out.println(str1);*/

        String s = "摇啊摇啊摇";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        sb.reverse();
        String s1 = sb.toString();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s.charAt(i)){
                System.out.println("不是回文");
                break;
            }else{
                System.out.println("是回文");
            }
        }
    }
}
