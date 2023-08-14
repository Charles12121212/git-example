package com.chen.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Producer {

    public static void main(String[] args) {


        AtomicInteger num = new AtomicInteger();

        num.getAndAdd(1);
        num.getAndAdd(1);
        num.getAndAdd(1);

        System.out.println(num.get());
    }


}
