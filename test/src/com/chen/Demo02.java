package com.chen;

/*
在某次考试中，10位同学的成绩如下：

~~~java
double[] score = {77.1, 88.1, 76.1, 56.1, 87.1, 98.1, 55.1, 94.1, 39.1, 96.1};
~~~

请编写程序，定义方法实现，计算本次考试这些同学的最高分、最低分和平均分。
 */
public class Demo02 {
    public static void main(String[] args) {
        double[] score = {77.1, 88.1, 76.1, 56.1, 87.1, 98.1, 55.1, 94.1, 39.1, 96.1};
        //最高分
        System.out.println("最高分为:" +getMax(score));
        //最低分
        System.out.println("最低分为:" +getMin(score));
        //平均分为
        System.out.println("平均分为:"+score(score));
    }

    private static double getMax(double[] arr) {
        double max = 0;
        //遍历数组,找最大值
        for (int i = 1; i < arr.length; i++) {
            max = arr[i - 1] < arr[i] ? arr[i] : arr[i - 1];
        }
        return max;
    }

    private static double getMin(double[] arr) {
        double min = 0;
        //遍历数组,找最大值
        for (int i = 1; i < arr.length; i++) {
            min = arr[i - 1] > arr[i] ? arr[i] : arr[i - 1];
        }
        return min;
    }

    private static double score(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double result = sum / arr.length;
        return result;
    }


}
