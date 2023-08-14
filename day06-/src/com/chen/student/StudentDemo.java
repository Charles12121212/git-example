package com.chen.student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        student s1 = new student("tom", 20);
        student s2 = new student("Jerry", 30);
        student s3 = new student("tom", 20);
        student s4 = new student("too", 22);

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());


    }
}
