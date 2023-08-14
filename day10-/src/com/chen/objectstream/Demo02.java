package com.chen.objectstream;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        objwriter();

        objreader();
    }

    private static void objreader() throws IOException, ClassNotFoundException {
        //创建读数据对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("day10-\\obj.txt"));

/*        //接住数据对象
        ArrayList<Student> students = (ArrayList<Student>) in.readObject();
        //打印对象
        students.forEach(student -> System.out.println(student));
        EOFException
        */
        Object o;
        while (true){
            try {
                Student student = (Student) in.readObject();
                System.out.println(student);
            } catch (EOFException e) {
                break;
            }
        }
        in.close();
    }

    private static void objwriter() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("day10-\\obj.txt"));
        //将对象放入集合 只写一次
/*        Student s1 = new Student("Tom", 20, 8888);
        Student s2 = new Student("Jerry", 21, 9999);
        Student s3 = new Student("lisi", 11, 130000);
        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students, s1, s2, s3);
                out.writeObject(students);
                */

        //写出多个对象
        Student s1 = new Student("Tom", 20, 8888);
        Student s2 = new Student("Jerry", 21, 9999);
        Student s3 = new Student("lisi", 11, 130000);

        out.writeObject(s1);
        out.writeObject(s2);
        out.writeObject(s3);

        out.close();
    }


}
