package com.chen;

import java.util.HashMap;

/*
现收集到一些学生的姓名和年龄信息，以字符串的形式存储在数组中。
String[] students = new String[]{"Tom", "20", "Bob", "21", "jerry", "22", "Tony", "25", "Jack", "24"};
其中第一个元素为姓名，第二个为前面姓名对应的年龄；后续元素都是这样排列。
请将这些信息以姓名（String类型）作为键，以年龄（Integer类型）作为值，存入map集合，并遍历查看结果。
输出如下：
Tony=25
Tom=20
...
 */
public class Test03 {
    public static void main(String[] args) {
        String[] students = new String[]{"Tom", "20", "Bob", "21", "jerry", "22", "Tony", "25", "Jack", "24"};
        //用hashmap接住
        HashMap<String, String> map = new HashMap<>();
        //遍历字符串数组,每次加等2
        for (int i = 0; i < students.length; i += 2) {
            String name = students[i];
            String age = students[i + 1];
            map.put(name, age);
        }
        //遍历map
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
