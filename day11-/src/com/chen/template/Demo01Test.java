package com.chen.template;

public class Demo01Test extends Demo01 {
    @Override
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("hello" + i);
        }
    }
}
