package com.chen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        //创建集合容器
        ArrayList<String> list = new ArrayList<>();

        //添加
        System.out.println(list.add("hello"));
        list.add("java");
        list.add("world");
        list.add("hi");
        list.add("java");
        list.add("hello");
        list.add("hello");

        //遍历
        Iterator<String> it = list.iterator();
        //判断是否有下一个
        System.out.println(it.hasNext());
        System.out.println(it.hasNext());
        //获取下一个元素
        System.out.println(it.next());
        System.out.println(it.next());

        for (String s : list) {
            System.out.println(s);
        }



    }

}
