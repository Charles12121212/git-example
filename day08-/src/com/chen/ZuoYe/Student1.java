package com.chen.ZuoYe;

public class Student1 implements Students {
    private String name;
    private int age;

    public Student1 () {
    }

    public Student1(String name, int age) {
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
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public int compareTo(Students o) {
        //按照对象的年龄进行排序
        //主要判断条件: 按照年龄从小到大排序
        int result = this.age - o.age;
        //次要判断条件: 年龄相同时，按照姓名的字母顺序排序
        result = result == 0 ? this.name.compareTo(o.getName()) : result;
        return result;
    }*/

    @Override
    public int compareTo(Student1 o) {
        //按照对象的年龄进行排序
        //主要判断条件: 按照年龄从小到大排序
        int result = this.age - o.age;
        //次要判断条件: 年龄相同时，按照姓名的字母顺序排序
        result = result == 0 ? this.name.compareTo(o.getName()) : result;
        return result;
    }
}
