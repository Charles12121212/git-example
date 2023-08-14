package com.chen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo07 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // 添加
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("张无忌", "赵敏");

/*        //获取每个键
        Set<String> s = map.keySet();
        System.out.println(s);

        //根据键获取值
        for (String s1 : s) {
            System.out.println(map.get(s1));

        }*/

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
/*        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            //通过键值对获取
            String value = entry.getValue();
            System.out.println(key +"=" +value);
        }*/

        map.forEach((k,v) -> System.out.println(k+v));

    }

}
