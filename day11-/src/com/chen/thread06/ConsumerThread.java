package com.chen.thread06;

import java.util.ArrayList;

public class ConsumerThread extends Thread{

    private ArrayList<String> list;

    public ConsumerThread(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //只要有就消费
        while (true){
            synchronized (list){
                if (list.isEmpty()){
                    //没有产品,等待生产者
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //有产品,消费者执行
                String name = list.remove(0);
                System.out.println(Thread.currentThread().getName()+ "消费了产品,产品剩余:"+list.size());
                //唤醒生产者来生产
                list.notifyAll();


            }
        }
    }
}
