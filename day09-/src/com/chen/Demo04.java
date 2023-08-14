package com.chen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo04 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "赵敏");
 /*       System.out.println(map.put("郭靖", "黄蓉"));
        System.out.println(map);*/

/*        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String s = entry.getKey();
            String value = entry.getValue();
            System.out.println(s + "\t" + value);

        }*/

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            String v = map.get(s);
            System.out.println(s + "\t" + v);
        }

        map.forEach((k,v) -> System.out.println(k + "\t" + v));


    }

}
