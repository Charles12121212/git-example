package com.chen.thread3.thread4;

public class MyTivkeys implements Runnable {

    private int tickeys = 100;
    private Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (tickeys > 0) {
                    System.out.println(Thread.currentThread().getName() + "还剩:" + tickeys);
                    tickeys--;
                } else {
                    System.out.println("卖完了");
                    break;
                }
            }
        }
    }
}
