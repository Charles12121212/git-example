package com.chen;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Administrator\\Desktop\\重要代码.md");
        System.out.println(f.length());

        File dir = new File("E:\\java");
        System.out.println(dir.length());


    }
}
