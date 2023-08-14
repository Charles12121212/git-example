package com.chen;

import java.util.Comparator;

public class Teacher implements Comparable<Teacher> {

    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';


    }

    @Override
    public int compareTo(Teacher o) {
        int num = this.age - o.age;
        if (num == 0){
            num = this.name.compareTo(o.name);
        }
        return num;

    }
}
