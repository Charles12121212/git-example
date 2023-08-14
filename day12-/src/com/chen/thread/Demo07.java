package com.chen.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo07 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger num = new AtomicInteger();

        //创建自增10000次的任务
        for (int i = 0; i < 10; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int i1 = 0; i1 < 10000; i1++) {
                        num.getAndAdd(1);
                    }


                }
            }).start();

        }

        Thread.sleep(10);

        System.out.println(num);
        System.out.println(num.get());


    }


}
