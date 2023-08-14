package com.chen.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            //只要新任务提交 只要还没有到达固定数量,会开启新线程执行任务
            executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));
            Thread.sleep(10);

        }

        //

    }



}
