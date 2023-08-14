package com.chen.test2;

import java.util.TreeMap;
import java.util.TreeSet;

public class CompareTotest {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<CompareTo> ts = new TreeSet<>();
        //创建学生对象
        CompareTo s1 = new CompareTo("zhangsan",27);
        CompareTo s2 = new CompareTo("lisi",27);
        CompareTo s3 = new CompareTo("wangwu",29);
        CompareTo s4 = new CompareTo("zhaoliu",28);
        CompareTo s5 = new CompareTo("lisi",27);
        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //遍历集合
        for (CompareTo student : ts) {
            System.out.println(student);
        }

    }
}
