package com.chen;

import java.util.HashMap;
import java.util.HashSet;

public class Demo08impl {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();

        Student s1 = new Student("西施", 16);
        Student s2 = new Student("貂蝉", 17);
        Student s3 = new Student("王昭君", 18);
        Student s4 = new Student("杨玉环", 18);
        Student s5 = new Student("杨玉环", 18);

        map.put(s1,"北京");
        map.put(s2,"深圳");
        map.put(s3,"北京");
        map.put(s4,"北京");
        map.put(s5,"上海");

        map.forEach((k,v) -> System.out.println(k +v));


    }



}
