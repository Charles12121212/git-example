package com.chen.thread3;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.concurrent.locks.Lock;

public class Demo01 extends Thread{

    private int tickeys = 100;

    @Override
    public void run() {
//        synchronized()
        while (true){
                if (tickeys > 0){
                    System.out.println(Thread.currentThread().getName() + "还剩:" + tickeys);
                    tickeys--;
                }else{
                    System.out.println("卖完了");
                    break;
                }
        }




    }
}
