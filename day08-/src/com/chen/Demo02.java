package com.chen;

import java.util.ArrayList;

public class Demo02 {

    public static void main(String[] args) {

        //创建集合容器
        ArrayList<String> list = new ArrayList<>();

        //添加字符串
        System.out.println(list.add("hello"));
        list.add("hello");
        list.add("hello");
        list.add("hi");
        list.add("java");
        list.add("hello");
        list.add("hello");
        System.out.println(list);

/*        list.clear();
        System.out.println(list);*/

//        list.remove("hello");

/*        list.removeIf( (s) -> s.startsWith("h"));
        System.out.println(list);*/

        list.contains("hello");
        System.out.println(list);

        System.out.println(list.size()); // 元素个数

        Object[] toArray = list.toArray();

//        System.out.println(String.toString(toArray));



    }

}
