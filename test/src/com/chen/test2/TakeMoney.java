package com.chen.test2;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/*
有两个用户（甲和乙）分别从同一个账户取钱，总金额为5000元，每人每次随机取出100、200、300、400或者500元；当余额不足时停止取钱。
请使用多线程所学知识，模拟实现上述场景，运行效果如下：
~~~
甲取出400元，账户剩余：4600元
甲取出200元，账户剩余：4400元
甲取出100元，账户剩余：4300元
甲取出200元，账户剩余：4100元
甲取出200元，账户剩余：3900元
甲取出500元，账户剩余：3400元
甲取出500元，账户剩余：2900元
乙取出200元，账户剩余：2700元
乙取出500元，账户剩余：2200元
乙取出500元，账户剩余：1700元
乙取出300元，账户剩余：1400元
甲取出200元，账户剩余：1200元
甲取出500元，账户剩余：700元
乙取出200元，账户剩余：500元
乙取出400元，账户剩余：100元
~~~
说明：以上仅为一次运行的效果，多次运行时，甲乙的取钱次数不确定。但不允许出现超取的现象。
 */
public class TakeMoney{

    public static void main(String[] args) {
        AtomicInteger yuE = new AtomicInteger(5000);
        //开启线程1
        new Thread(() -> {
            while (true) {
                //定义数组,随机取100-500
                int[] arr = new int[]{100, 200, 300, 400, 500};
                Random r = new Random();
                int i = r.nextInt(5);
                //获取当前yuE的值
                yuE.getAndAdd(-arr[i]);
                System.out.println(Thread.currentThread().getName() + "取了:" + arr[i] + ",剩余:" + yuE.get());
                //判断结束条件
                if (yuE.get() <= 500) {
                    break;
                }
            }
        }).start();
        //开启线程2
        new Thread(() -> {
            while (true) {
                int[] arr = new int[]{100, 200, 300, 400, 500};
                Random r = new Random();
                int i = r.nextInt(5);
                //获取当前yuE的值
                yuE.getAndAdd(-arr[i]);
                System.out.println(Thread.currentThread().getName() + "取了:" + arr[i] + ",剩余:" + yuE.get());
                if (yuE.get() <= 500) {
                    break;
                }
            }
        }).start();
    }
}

