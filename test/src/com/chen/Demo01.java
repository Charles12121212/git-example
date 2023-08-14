package com.chen;

/*
一个小球从高处落下，落地后反弹的高度是原来高度的一半，然后再次落下。
请编写程序计算，如果小球的原始高度为100米，那么在第10次落地后，反弹高度是多少？
在第10次反弹到达最高点时，经过的总路程是多少？
 */
public class Demo01 {
    public static void main(String[] args) {
        //原始高度
        double height = 100;
        //第一次反弹之前就是100;
        double sum = height;
        //循环十次
        for (int i = 0; i < 10; i++) {
            //第一次就等于100+50
            height = height / 2;
            sum = sum + height;
        }
        //打印总路程
        System.out.println("总路程是:" + sum);

    }

}
