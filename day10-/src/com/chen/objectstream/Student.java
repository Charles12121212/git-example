package com.chen.objectstream;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int age;

    private static final long serialVersionUID = 1L;

    //瞬态关键字
//    private transient double salary;
    private double salary;

    public Student() {
    }


    public Student(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
