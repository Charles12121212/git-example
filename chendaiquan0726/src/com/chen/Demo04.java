package com.chen;

public class Demo04 {
    public static void main(String[] args) {
        //测试1
        int[] arr1 = {1, 2, 2, 3, 3, 3, 9};
        int[] arr2 = {3, 5};
        int[] a1 = intersection(arr1, arr2);
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]);
        }
        System.out.println();

        //测试2
        int[] arr3 = {1, 2, 2, 3, 3, 3, 9};
        int[] arr4 = {2, 3, 5};
        int[] a2 = intersection(arr3, arr4);
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i]);
        }
        System.out.println();

        //测试3
        int[] arr5 = {1, 3};
        int[] arr6 = {2, 4, 5};
        int[] a3 = intersection(arr5, arr6);
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i]);
        }
        System.out.println();
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        //定义数组的最大值
        int[] result = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
        //遍历数组1
        for (int i = 0; i < arr1.length; i++) {
            //遍历数组2
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (arr1[i] == arr2[i1]) {
                    //遍历数组result
                    for (int i2 = 0; i2 < result.length; i2++) {
                        result[i2] = arr2[i1];
                    }
                }
            }
        }
        return result;
    }

}
