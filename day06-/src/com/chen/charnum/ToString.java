package com.chen.charnum;

import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,31,4,15,16,17,18,19,20};
        //创建对象
        StringBuilder sb = new StringBuilder();
        //先打印半边
        System.out.print("[");
        //遍历字符串
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            //中间加逗号
            if (i != arr.length - 1){
                sb.append(",");
            }
        }
        //将StringBuilder类型转为string类型
        String s1 = sb.toString();
        //打印内容
        System.out.print(s1);
        //打印另外一边
        System.out.println("]");
        //来,走起

        sb.insert(2,"666");
        String s2 = sb.toString();
        System.out.println(s2);

        String s3 = arr.toString();
        System.out.println(s3);

        //字符串转换为字符数组
        String str = "4654rwerwe";
        char[] i = str.toCharArray();

    }
}

