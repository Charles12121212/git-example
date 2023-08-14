package com.chen;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        int[] array = generateNumbers(); // 生成包含一定数量的数字的数组
        //定义数组
        int[] arr = {1, 2, 3, 5, 5, 5, 7, 8, 9};
        find(arr);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
        }
    }
    public static void find(int[] arr) {
        //键盘输入查找的数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查找的数:");
        int num = sc.nextInt();
        //做个标记
        int count = 0;
        //找出输入值所在的索引并输出
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.print(i);
                int num1 = i;
                generateNumber(i);
                //标记搞起来
                count++;
            }
        }
        //输出换行
        System.out.println();
        System.out.println(count);
    }
    public static int[] generateNumbers() {
        int n = 10; // 数字的个数
        int[] array = new int[n]; // 创建包含n个元素的数组
        for (int i = 0; i < n; i++) {
            int number = generateNumber(i); // 生成一个数字
            array[i] = number; // 将数字放入数组的相应位置
        }
        return array;
    }

    public static int generateNumber(int i) {
        // 生成一个随机数，示例中使用0到100的范围
        return (int) (i);
    }
}
