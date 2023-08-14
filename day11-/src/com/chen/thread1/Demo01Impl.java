package com.chen.thread1;

public class Demo01Impl {
    public static void main(String[] args) {
        Demo01 d = new Demo01();
        d.setName("线程1");
        d.start();

        Demo01 d1 = new Demo01();
        d1.setName("Jerry");
        d1.start();
    }

}
