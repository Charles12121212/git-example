package com.chen.test1;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/*
list转map集合

有如下List集合：

~~~java
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list, "Tom", "80", "Jerry", "85", "Jack", "82", "Rose", "90", "John", "88", "Tony", "77");
~~~

集合中第一个元素为同学姓名，第二个为该同学的考试成绩；后续元素也按照这个方式存储。

请编写程序，将List集合中的数据，存入Map集合，Map集合中的键为姓名（字符串），值为成绩（Integer）；
要求集合中的数据是按照姓名自然顺序排列的。遍历Map集合查看结果，输出如下：
Jack: 82
Jerry: 85
John: 88
Rose: 90
Tom: 80
Tony: 77
 */
public class ListToMap {
    public static void main(String[] args) {

/*        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "80", "Jerry", "85", "Jack", "82", "Rose", "90", "John", "88", "Tony", "77");

        Map<String, String> map = new TreeMap<>((o1, o2) -> {
            if (o1.length() - o2.length() == 0) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });
        for (int i = 0; i < list.size(); i += 2) {
            map.put(list.get(i), list.get(i + 1));
        }
        map.forEach((k, v) -> System.out.println(k + ":" + v));*/
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "80", "Jerry", "85", "Jack", "82", "Rose", "90", "John", "88", "Tony", "77");
        //创建map集合
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < list.size(); i += 2) {
            String s = list.get(i);
            String value = list.get(i + 1);
            Integer score = Integer.valueOf(value);
            map.put(s, score);
        }
        //遍历map集合
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }
}
