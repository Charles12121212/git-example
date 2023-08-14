package com.chen.test2;

import java.util.*;

/*
某学校几位老师负责的课程如下：
| 姓名  | 科目   |
| ----- | ------ |
| Tom   | java   |
| Jerry | mysql  |
| Lucy  | hadoop |
| Lily  | oracle |
| Jack  | linux  |
| Rose  | oracle |
| John  | oracle |
请分别实现如下需求：
1） 以姓名作键，以科目名称作值，将上面的信息存储到一个Map集合中；
2） 将所有名字以”J“开头的老师以及对应的科目信息输出，效果如下（顺序不限）：
~~~java
Jerry=mysql
Jack=linux
John=oracle
~~~
3） 找到所有负责”oracle“课程的老师，输出他们的名字，效果如下（顺序不限）：
~~~
Lily
Rose
John
~~~
 */
public class Teacher {
    public static void main(String[] args) {
        //创建map集合
        Map<String, String> map = new LinkedHashMap<>();
        //放入数据
        map.put("Tom", "java");
        map.put("Jerry", "mysql");
        map.put("Lucy", "hadoop");
        map.put("Lily", "oracle");
        map.put("Jack", "linux");
        map.put("Rose", "oracle");
        map.put("John", "oracle");

        //遍历map集合
        map.forEach((k, v) -> {
            //将所有名字以”J“开头的老师以及对应的科目信息输出
            if (k.charAt(0) == 'J') {
                System.out.println(k + "=" + v);
            }
        });

        map.forEach((k, v) -> {
            //找到所有负责”oracle“课程的老师，输出他们的名字
            if (v.equals("oracle")) {
                System.out.println(k);
            }
        });

    }
}
