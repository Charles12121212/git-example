package com.systemui;

import com.chen.NameAndKey;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //用户界面
        System.out.println("Hello World!");
        //
        NameAndKey nameAndKey = new NameAndKey();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        nameAndKey.setName(name);
        int key = sc.nextInt();
        nameAndKey.setKey(key);
    }
}
