package com.chen;

import java.util.HashMap;

public class Demo05 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        //添加
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");
        map.put("张无忌","赵敏");

        //删除键  删除一对yuansu
        map.remove("尹志平");
        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("杨过"));
        System.out.println(map.size());

    }




}
