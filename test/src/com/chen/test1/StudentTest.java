package com.chen.test1;

import java.util.Scanner;
import java.util.TreeMap;

/*
现获取到如下学生信息：

| 学号       | 姓名  | 年龄 |
| ---------- | ----- | ---- |
| 2023050501 | Tom   | 20   |
| 2023050502 | Jerry | 19   |
| 2023050503 | Jack  | 21   |
| 2023050504 | Rose  | 18   |
| 2023050505 | John  | 20   |

请定义list集合，将以上每条信息以学生对象的方式存入集合中。并定义方法，实现对于输入的学号，判断该学号的学生是否存在。
如果存在请获取该学生的所有信息，如果不存在，给出提示。

程序运行效果如下：

测试用例1：

~~~
请输入学号：
2023050502
学生信息：
学号：2023050502，姓名：Jerry，年龄：19
~~~

测试用例2：

~~~
请输入学号：
2023050508
没有学号为2023050508的学生
~~~


 */
public class StudentTest {
    public static void main(String[] args) {
        //创建map数组
        TreeMap<Integer, Student> map = new TreeMap<>();
        //写入学生对象
        Student s1 = new Student("Tom", 20);
        Student s2 = new Student("Jerry", 19);
        Student s3 = new Student("Jack", 21);
        Student s4 = new Student("Rose", 18);
        Student s5 = new Student("John", 20);
        //将学生对象写入数组
        map.put(2023050501, s1);
        map.put(2023050502, s2);
        map.put(2023050503, s3);
        map.put(2023050504, s4);
        map.put(2023050505, s5);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号:");
        int num = sc.nextInt();
        if (map.get(num) == null) {
            System.out.println("没有学号为:" + num + "的学生");
        } else {
            String name = map.get(num).getName();
            int age = map.get(num).getAge();
            System.out.println("学号:" + num + ",姓名:" + name + ",年龄:" + age);
        }
    }
}



