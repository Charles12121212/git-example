package com.chen.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));

//            Thread.sleep(10);
        }

        //当新任务提交是,如果有空闲的线程 复用:如果没有创建新线程执行任务





    }


}
