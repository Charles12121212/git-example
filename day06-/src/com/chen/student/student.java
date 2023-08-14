package com.chen.student;



import java.util.Objects;

public class student {
    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //向下转型
        student student = (student) o;
        if (age != student.age) {
            return false;
        }
        return age == student.age && Objects.equals(name, student.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
