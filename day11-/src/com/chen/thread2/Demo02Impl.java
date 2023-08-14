package com.chen.thread2;

public class Demo02Impl {

    public static void main(String[] args) {

        Demo01 d1 = new Demo01();
        Thread t1 = new Thread(d1);
        t1.setName("猫");
        t1.start();



    }



}
