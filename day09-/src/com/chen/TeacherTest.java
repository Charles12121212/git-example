package com.chen;

import javax.swing.*;
import java.util.Comparator;
import java.util.TreeMap;

public class TeacherTest {

    public static void main(String[] args) {
/*
        TreeMap<Teacher, String> map = new TreeMap<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int num = o1.getAge() - o2.getAge();
                if (num == 0) {
                    num = o1.getName().compareTo(o2.getName());
                }
                return num;
            }
        });
*/
        TreeMap<Teacher, String> map =new TreeMap<>((o1, o2) -> {
            int num = o1.getAge() - o2.getAge();
            if (num == 0) {
                num = o1.getName().compareTo(o2.getName());
            }
            return num;
        });
                Teacher t1 = new Teacher("Tony", 20);
        Teacher t2 = new Teacher("Jack", 19);
        Teacher t3 = new Teacher("Tom", 21);
        Teacher t4 = new Teacher("Jerry", 20);
        Teacher t5 = new Teacher("Jerry", 20);

        map.put(t1, "北京");
        map.put(t2, "北京1");
        map.put(t3, "北京2");
        map.put(t4, "北京3");
        map.put(t5, "北京4");

        map.forEach((k, v) -> System.out.println(k + v));

    }

}
