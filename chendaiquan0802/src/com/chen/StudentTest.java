package com.chen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象的list集合
        List<Student> list = new ArrayList<>();
        //new学生对象,输入数据
        Student s1 = new Student(2023050501, "Tom", 20);
        Student s2 = new Student(2023050502, "Jerry", 19);
        Student s3 = new Student(2023050503, "Jack", 21);
        Student s4 = new Student(2023050503, "Rose", 18);
        Student s5 = new Student(2023050503, "John", 20);
        //将学生对象放入集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //键入学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        int num = sc.nextInt();

        //查找并返回改学生对象,如果没有,就返回空
        Student student = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum() == num) {
                student = list.get(i);
                break;
            }
        }
        //用获取的学生对象判断,打印
        if (student != null) {
            System.out.println("学生信息：");
            System.out.println("学号：" + student.getNum()
                    + "，姓名：" + student.getName()
                    + "，年龄：" + student.getAge());
        } else {
            System.out.println("没有学号为" + num + "的学生");
        }
    }
}
