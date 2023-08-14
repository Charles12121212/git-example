package com.chen.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest1 {
    public static void main(String[] args) {
        //创建学生对象的list集合
        List<Student1> list = new ArrayList<>();
        //new学生对象,输入数据
        Student1 s1 = new Student1(2023050501, "Tom", 20);
        Student1 s2 = new Student1(2023050502, "Jerry", 19);
        Student1 s3 = new Student1(2023050503, "Jack", 21);
        //将学生对象放入集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //键入学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        int num = sc.nextInt();

        //查找并返回索引
        Student1 target = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum() == num) {
                target = list.get(i);
                break;
            }
        }
        if (target != null) {
            System.out.println("学生信息：");
            System.out.println("学号：" + target.getNum()
                    + "，姓名：" + target.getName()
                    + "，年龄：" + target.getAge());
        } else {
            System.out.println("没有学号为" +num + "的学生");
        }

        sc.close();

    }


}
