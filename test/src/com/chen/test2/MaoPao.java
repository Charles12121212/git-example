package com.chen.test2;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 5, 6, 2, 44, 1, 3, 77, 9, 96, 0};
        int temp;
        //外循环确定循环的次数
        for (int i = 1; i <= arr.length - 1; i++) {
            //内循环确定是否交换,随着外循环次数增加,内循环次数减少
            for (int k = 0; k < arr.length - i; k++) {
                //如果前面那位大于后面那位,交换位置
                if (arr[k] >= arr[k + 1]) {
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
