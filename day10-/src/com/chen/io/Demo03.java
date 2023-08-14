package com.chen.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo03 {

    public static void main(String[] args) throws IOException {

        //创建输入流
        FileInputStream input = new  FileInputStream("day10-\\a.txt");

        //读数据 读取一个字节 返回值表示读到的字节值 如果到末尾 返回-1

        int by;
        while ((by = input.read()) != -1){
            System.out.print((char) by);
        }

        byte[] buffer = new byte[8192];

        int len = input.read(buffer);

        System.out.println(len);

//        while ((len = )?

    }


}
