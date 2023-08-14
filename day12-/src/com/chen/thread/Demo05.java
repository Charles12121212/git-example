package com.chen.thread;

import com.sun.scenario.effect.impl.hw.ShaderSource;

import java.util.concurrent.*;

public class Demo05 {
    //创建阻塞队列
    private static ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);

    public static void main(String[] args) {


        //生产
        new Thread(() -> {
            while (true) {
                String name = "手机";
                try {
                    queue.put(name);
                    System.out.println(Thread.currentThread().getName()+"生产了一步手机,剩余:"+queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        //销售
        new Thread(() -> {

            //一直消费
            while (true){
                //否则就消费
                String name = null;
                try {
                    name = queue.take();
                    System.out.println(Thread.currentThread().getName()+"消费了"+name+ "剩余:"+queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }

}
