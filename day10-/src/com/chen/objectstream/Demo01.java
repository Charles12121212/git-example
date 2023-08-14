package com.chen.objectstream;

import java.io.*;
import java.util.Objects;

public class Demo01 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        objwriter();

        objreader();


    }

    private static void objreader() throws IOException, ClassNotFoundException {
        //创建读数据对象流
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream("day10-\\obj.txt"));

        //读数据
        Object o = reader.readObject();
        System.out.println(o);
    }


    private static void objwriter() throws IOException {
        //创建对象流
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("day10-\\obj.txt"));
        //写入对象流
        Student s1 = new Student("张三",30,100000);
        //序列化
        writer.writeObject(s1);
        //关闭资源
        writer.close();
    }


}
