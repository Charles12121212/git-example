package com.chen.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {
    public static void main(String[] args) {
        //通过工具类的静态方法
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //提交任务
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()+"执行了"));

        //销毁线程池
        executorService.shutdown();


    }


}
