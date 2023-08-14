package com.chen.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Tickey {

    //定义成员变量
    private static AtomicInteger tickeys = new AtomicInteger();

    public static void main(String[] args) {

        //开启两个线程
        for (int i = 0; i < 2; i++) {
            //创建线程
            new Thread(() -> {
                //卖票,直到10张
                while (true) {
                    //每次加等1
                    tickeys.addAndGet(1);
                    //打印语句
                    System.out.println(Thread.currentThread().getName() + "卖了第"+ tickeys+"张票");
                    //判断退出语句
                    if (tickeys.get() == 10){
                        System.out.println("票买完了");
                        System.out.println(tickeys);
                        break;
                    }
                }
            }).start();
        }
    }
}
