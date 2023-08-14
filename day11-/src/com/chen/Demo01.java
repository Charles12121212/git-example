package com.chen;

public class Demo01 extends Thread {
    private int ticket = 100;

    @Override
    public void run() {
        for (int i = 0; i < ticket; i++) {
            System.out.println(Thread.currentThread().getName()+"卖了" + (i + 1) + "张票");
        }
    }
}
