package com.chen.ui;

import com.chen.database.DataBase;

import javax.naming.Name;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {


        //创建键入名字的对象
        Scanner sc = new Scanner(System.in);
        //输入用户名
        System.out.println("请输入用户名:");
        String name = sc.next();

        //去数据库拿数据
        DataBase d = new DataBase();
        String username = d.getName();
        int index;
        //机会无限次
        while (true) {
            //拿索引判断重复,有重复值返回-1
            index = username.indexOf(name);
            //判断名字是否为空
            if (name == "") {
                System.out.println("名字为空,请输入用户名:");
                name = sc.next();
            }
            //与数据库没有相同名字时,输入成功,跳出循环
            if (index == -1) {
                System.out.println("输入成功!");
                break;
            } else {
                System.out.println("用户名相同,请重新输入:");
                name = sc.next();
            }
        }
    }
}
