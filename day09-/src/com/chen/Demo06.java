package com.chen;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo06 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        // 添加
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "赵敏");

 /*       String v = map.get("张无忌1");
        System.out.println(v);

        Set<String> s = map.keySet();
        for (String s1 : s) {
            System.out.println(s);
        }*/


        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
/*        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry);
        }*/
        map.forEach((k,v) -> System.out.println(k+v));
        entrySet.forEach(s -> System.out.println(s));


    }



}
