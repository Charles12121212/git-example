package com.chen.jiekou2;

public abstract class Employee {
    //属性
    private String name;
    private int age;
    //行为
    public abstract void work();
    //实现的行为
    public void work1(){
        System.out.println("上班给老板挣钱");
    }


    public Employee() {
    }

    public Employee(String name, int age) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
