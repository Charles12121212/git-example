package com.chen;

import java.util.Arrays;
import java.util.Scanner;

/*
1、java语言中，数组是长度固定的，即数组一旦初始化，该数组的长度就固定不变了。
那么如果有更多的元素要存入数组，就需要定义新的数组来实现。
现有如下数组：
数组中的元素是按照升序排序的，请通过键盘再录入一个整数，将其存储到合适的位置，使得数组中的数据仍然保持升序。
 */
public class Test01 {
    public static void main(String[] args) {
        //原有数组
        int[] arr = {11, 22, 33, 44, 55};
        //键入新整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        //调用newArray方法,打印结果数组
        int[] result = newArray(arr, num);
        //打印
        System.out.println(Arrays.toString(result));
    }

    //创建方法,将整数放在数组中
    private static int[] newArray(int[] arr, int num) {
        //定义新数组
        int[] result = new int[arr.length + 1];
        //遍历arr
        for (int i = 0; i < arr.length; i++) {
            //如果比最大的还要大
            if (arr[arr.length-1] <= num) {
                result[i] = arr[i];
                result[result.length-1] = num;
            }
            //如果比最小的还要小
            if (arr[0] <= num) {
                result[0] = num;
                result[i + 1] = arr[i];
            }
            //如果在中间,比它小的部分
            if (arr[i] < num) {
                result[i] = arr[i];
                //在后面都加个值覆盖掉,直到最后一个
                result[i+1] = num;
            }
            //如果在中间,比他大的部分
            if (arr[i] > num){
                result[i+1] = arr[i];
            }
        }
        return result;
    }
}
