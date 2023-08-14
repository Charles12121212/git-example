package com.test;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 10);
        map.put("c", 20);

        map.put("b", map.get("b") + 2);

        map.forEach((k,v) -> System.out.println(k + "=" + v));

    }
}
