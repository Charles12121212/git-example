package com.chen.charstream;

import org.omg.CORBA.LongHolder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //创建输入流
        FileInputStream in = new FileInputStream("F:\\原G盘\\2、中化明达\\打印机软件.zip");


        //创建输出流
        FileOutputStream out = new FileOutputStream("E:\\新建文件夹2\\打印机软件.zip");

        //每次读写一个字节数组
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes)) != -1) {
            //把缓冲区数组中的数据写到目的地
            out.write(bytes,0,len); //注意写出有效部分
        }

        // 释放资源
        in.close();
        out.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
