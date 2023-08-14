package com.chen.jiekou;

public class CImpl implements C{

    @Override
    public void a() {
        System.out.println("C接口实现,a方法重写");
    }

    @Override
    public void b() {
        System.out.println("C接口实现,b方法重写");
    }

    public CImpl() {
    }
}
