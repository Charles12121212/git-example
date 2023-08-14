package com.chen.ZuoYe;

import java.util.Collections;
import java.util.HashSet;

public class StudentTest {

    public static void main(String[] args) {
        //创建hash的学生集合对象
        HashSet<Student> hs = new HashSet<Student>();

        //创建学生对象
        Student s1 = new Student("张三",30);
        Student s2 = new Student("李四", 35);
        Student s3 = new Student("王五", 33);

        Student s4 = new Student("王五", 33);

        //将学生对象放在集合里面
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);



        //遍历集合 增强for
        for (Student h : hs) {
            System.out.println(h);
        }
    }

}
