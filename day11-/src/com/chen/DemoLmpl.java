package com.chen;

public class DemoLmpl {

    public static void main(String[] args) {

        new Demo01().start();

        Demo01 d2 = new Demo01();
        d2.start();


        System.out.println(Thread.currentThread().getName());


    }
}
