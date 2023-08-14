package com.chen.jiekou;

public class interImpl implements inter1,inter2{

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void world() {
        System.out.println("world");
    }
}
