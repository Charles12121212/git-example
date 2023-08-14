package com.chen.thread05;

import java.util.concurrent.ArrayBlockingQueue;

public class ConsumerThread extends Thread {

    private ArrayBlockingQueue<String> queue;

    public ConsumerThread(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        //消费者不停消费
        while (true) {
            String s = null;
            try {
                s = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "消费了" + s
                    + "还剩余:" + queue.size());
        }
    }
}
