package com.chen.test2;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class CompareTo implements Comparable<CompareTo> {

    private int age;
    private String name;


    public CompareTo() {
    }

    public CompareTo(String name, int age) {
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
        return "CompareTo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(CompareTo o) {
        int result = this.age - o.age;
        result = result == 0 ?
                this.getName().compareTo(o.getName())
                : result;
        return result;
    }
}
