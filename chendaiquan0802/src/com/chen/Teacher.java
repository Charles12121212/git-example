package com.chen;

import java.util.LinkedHashMap;
import java.util.Map;

public class Teacher {
    public static void main(String[] args) {
        //创建map集合
        Map<String, String> map = new LinkedHashMap<>();
        //放入数据
        map.put("Tom", "java");
        map.put("Jerry", "mysql");
        map.put("Lucy", "hadoop");
        map.put("Lily", "oracle");
        map.put("Jack", "linux");
        map.put("Rose", "oracle");
        map.put("John", "oracle");
        //遍历map集合
        map.forEach((k, v) -> {
            //将所有名字以”J“开头的老师以及对应的科目信息输出
            if (k.charAt(0) == 'J') {
                System.out.println(k + "=" + v);
            }
        });
        map.forEach((k, v) -> {
            //找到所有负责”oracle“课程的老师，输出他们的名字
            if (v.equals("oracle")) {
                System.out.println(k);
            }
        });
    }
}
