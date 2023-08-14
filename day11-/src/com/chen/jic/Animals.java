package com.chen.jic;

public class Animals {
    //成员变量
    private String name = "动物";

    public void eat(){
        System.out.println("吃东西");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
