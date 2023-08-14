package com.chen.template;

public class Demo01TestTest {

    public static void main(String[] args) {
        Demo01 d1 = new Demo01() {
            @Override
            public void code() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("hello"+ i);
                }
            }
        };
        long time = d1.getTime();
        System.out.println(time);

    }




}
