package com.chen;

import com.chen.test2.StudengtHashMap;

import java.util.HashSet;

public class Demo02 {
    public static void main(String[] args) {
        // 定义set集合存储学生对象
        // 定义集合对象
        HashSet<StudengtHashMap> set = new HashSet<>();

        // 添加元素
        StudengtHashMap s1 = new StudengtHashMap("aaa", 18);
        StudengtHashMap s2 = new StudengtHashMap("bbb", 19);
        StudengtHashMap s3 = new StudengtHashMap("ccc", 20);
        StudengtHashMap s4 = new StudengtHashMap("ddd", 18);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        for (StudengtHashMap stu : set) {
            System.out.println(stu);
        }


    }
}
