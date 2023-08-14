package com.treeset;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        //没重写hashcode和equals就可以存三个,因为比较的是地址值
        //new一个对象的时候,就在堆里面开辟了空间,就记录了地址值
        //所以在存自定义的对象时,必须重写那两个方法
        HashSet<Student>hashSet = new HashSet<>();
        Student s1 = new Student("tom", 1);
        Student s2 = new Student("tom", 1);
        Student s3 = new Student("tom", 99);
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.forEach((k) -> System.out.println(k));
        HashSet<Integer>hashSet1 = new HashSet<>();
        hashSet1.add(66);
        hashSet1.add(66);
        hashSet1.add(66);
        hashSet1.add(66);
        hashSet1.add(66);
        hashSet1.add(66);
        hashSet1.forEach((i) -> System.out.println(i));
    }
}
