package com.chen;

public class Student {


    //属性 -- 成员变量
    String name;
    int age;
    String address;


    //行为 -- 成员方法
    public void study(){
        System.out.println("这是学生的学习功能");
    }

    public void eat(String str){
        System.out.println("去" + str + "吃饭");
    }


}
