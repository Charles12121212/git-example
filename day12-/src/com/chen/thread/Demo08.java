package com.chen.thread;

import java.util.concurrent.ConcurrentHashMap;

public class Demo08 {
    //新建成员变量
    private static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 24; i++) {
                map.put(String.valueOf(i), String.valueOf(i));
            }
        }).start();

        new Thread(() -> {
            for (int i = 24; i < 50; i++) {
                map.put(String.valueOf(i), String.valueOf(i));
            }
        }).start();

        map.forEach((k,v) -> System.out.println(k +"="+ v));

    }
}
