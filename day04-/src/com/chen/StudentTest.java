package com.chen;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.address = "北京";
        s1.age = 18;
        s1.study();
        s1.eat("");

    }
}
