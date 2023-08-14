package com.chen.test2;

import sun.java2d.pipe.LoopBasedPipe;

import java.util.*;

/*
请随机生成10个 1-100（包含边界）的随机数，存入数组中，并将数组的最小值挪到最前面，
最大值挪到最后面（即最小值与数组中的第一个元素交换，最大值与最后一个元素交换），
将挪动前和挪动后的数组分别遍历输出
要求：定义方法，使用Random随机生成长度为10的数组，数组中的元素不能重复
定义方法实现将这个数组中的最大值放到末尾，最小值放到前端
改进：定义方法对数组排序
 */
public class RandomArray {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = randomArray();
        System.out.println("调整前的数组是:" + Arrays.toString(arr));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int[] randomArray() {
        //创建1-100（包含边界）随机数对象
        Random random = new Random();
        //创建数组对象
        int[] arr = new int[100];
        //遍历数组
        Loop:for (int i = 0; i < 100; i++) {
            //判断不重复就存入
            while (true) {
                //产生随机数
                int randomnum = random.nextInt(100) + 1;
                //循环到i,判断重复
                for (int j = 0; j < i; j++) {
                    //如果有相等的,重新调用randomArray方法
                    if (randomnum == arr[j]) {
                        int[] arr1 = randomArray();
                        return arr1;
                    }
                    //如果没有相等的,存入数组
                    arr[i] = randomnum;
                }
                break;
            }
        }
        //返回数组
        return arr;

    }
}
