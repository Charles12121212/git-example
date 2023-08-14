package com.chen;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Demo05 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //添加
        System.out.println(list.add("hello"));
        list.add("java");
        list.add("world");
        list.add("hi");
        list.add("java");
        list.add("hello");
        list.add("hello");
        System.out.println(list);
    }
}
