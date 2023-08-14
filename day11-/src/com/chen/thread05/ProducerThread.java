package com.chen.thread05;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerThread extends Thread {

    private ArrayBlockingQueue<String> queue;

    public ProducerThread(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String name = "电脑";
            try {
                queue.put(name);
                System.out.println(Thread.currentThread().getName() + "存入了一个产品:" + name + "剩余个数:" + queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
