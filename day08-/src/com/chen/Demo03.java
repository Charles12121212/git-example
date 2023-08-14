package com.chen;

import java.util.ArrayList;

public class Demo03 {

    public static void main(String[] args) {

        //创建集合容器
        ArrayList<String> list = new ArrayList<>();

        //添加
        System.out.println(list.add("hello"));
        list.add("java");
        list.add("world");
        list.add("hi");
        list.add("java");
        list.add("hello");
        list.add("hello");

        String s1 = list.set(1, "eee");
        System.out.println(s1);

        for (String s : list) {
            System.out.println(s);
        }



    }
}
