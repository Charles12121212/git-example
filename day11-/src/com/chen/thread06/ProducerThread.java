package com.chen.thread06;

import java.util.ArrayList;

public class ProducerThread extends Thread {

    //创建容器 通过构造方法传入 保证使用同一个
    private ArrayList<String> list;

    public ProducerThread(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //生产100个产品
        for (int i = 0; i < 100; i++) {
            //多条线程对共享资源做修改操作,需要修改
            synchronized (list) {
                //判断是否应该生产者线程执行
                if (list.size() == 1){
                    //有产品,生产者等待
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有产品,生产者执行
                String name = "手机";
                list.add(name);
                System.out.println(Thread.currentThread().getName() + "生产了一个"+name);
                list.notifyAll();
            }
        }
    }
}
