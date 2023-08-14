package com.chen.thread06;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        //创建仓库集合
        ArrayList<String> list = new ArrayList<>();
        //让生产者生产
        ProducerThread p = new ProducerThread(list);
        //消费者消费
        ConsumerThread c = new ConsumerThread(list);
        //执行
        p.start();
        c.start();
    }
}
