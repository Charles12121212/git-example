package com.chen.thread2;

import java.util.zip.DeflaterOutputStream;

public class Demo01 implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"打印100次"+i);
        }

    }
}
