package com.chen.test1;

import java.util.Arrays;
import java.util.TreeSet;
/*
现有如下两个数组，元素如下：
 数组a：{11, 33, 55, 77}
 数组b：{22, 44, 66, 88}
请编写程序，将两个数组合并为一个数组c；要求包含a、b数组的所有元素即可，无需排序。
即结果为：{11, 33, 55, 77, 22, 44, 66, 88}

增加难度：要排序，要去重。返回并集
 */
public class bingji {
    public static void main(String[] args) {
        //数组
        int[] arr1 = {33, 11, 55, 77};
        int[] arr2 = {22, 44, 66, 88};
        //创建set集合
        TreeSet<Integer> set = new TreeSet<>();
        //遍历数组
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        //将集合的元素放在新数组中
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
//        String string = Arrays.toString();
        System.out.println(Arrays.toString(result));
    }
}
