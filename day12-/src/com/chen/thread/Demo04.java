package com.chen.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Demo04 {
    public static void main(String[] args) {

        //自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5,
                10,
                30,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy()
        );
        //提交任务
        for (int i = 0; i < 50; i++) {
            pool.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));

        }
    }
}
