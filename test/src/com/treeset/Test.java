package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //这个方法是Compartor实现类的匿名内部类的lamda表达式
//        TreeSet<Student> set = new TreeSet<>((s, t) -> t.getAge() - s.getAge());
/*        TreeSet<Student>set = new TreeSet<>();
        Student s1 = new Student("tom", 1);
        Student s2 = new Student("tom", 1);
        Student s3 = new Student("tom", 99);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        for (Student s : set) {
            System.out.println(s);
        }*/

        TreeSet<Integer>set1 = new TreeSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        set1.add(1);
        set1.forEach((i) -> System.out.println(i));

    }
}
