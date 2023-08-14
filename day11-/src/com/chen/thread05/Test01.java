package com.chen.thread05;

import java.util.concurrent.ArrayBlockingQueue;

public class Test01 {

    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(1);

        ProducerThread p = new ProducerThread(queue);
        ConsumerThread c = new ConsumerThread(queue);

        p.start();
        c.start();



    }


}
