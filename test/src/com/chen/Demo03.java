package com.chen;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 0, 0, 3};
        //记录0出现的索引
        int index = 0;
        //
        int temp;
        //外循环确定次数,假设全部为0,循环a.length次
        for (int i = 0; i < a.length; i++) {
            //内循环交换变量
            if (a[i] == 0){
                temp = a[i];
                a[i] = a[index];
                //下次如果再出现,就从index交换
                a[index++] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
