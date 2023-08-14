package com.chen.test1;
/*
在某次考试中，10位同学的成绩如下：
~~~java
double[] score = {77.1, 88.1, 76.1, 56.1, 87.1, 98.1, 55.1, 94.1, 39.1, 96.1};
~~~
请编写程序，定义方法实现，计算本次考试这些同学的最高分、最低分和平均分。
 */
public class Score {
    public static void main(String[] args) {
        double[] score = {77.1, 88.1, 76.1, 56.1, 87.1, 98.1, 55.1, 94.1, 39.1, 96.1};
        double sum = 0;
        double temp1 = 0;
        double temp2 = 0;
        double MAX = 0;
        double MIN = 0;
        for (int i = 0; i < score.length; i++) {
            //判断最高分
            MAX = score[i] >= temp1 ? score[i] : temp1;
            temp1 = MAX;

            //判断最低分
            MIN = score[i] <= temp2 ? score[i] : temp2;
            temp2 = score[0];

            sum += score[i];

        }
        //计算平均分
        double num = sum / score.length;

        System.out.println(MAX);
        System.out.println(MIN);
        System.out.println(num);


    }


}
