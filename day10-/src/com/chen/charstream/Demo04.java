package com.chen.charstream;

import java.io.*;

public class Demo04 {

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        //创建输入流对象
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("E:\\新建文件夹2\\打印机软件.zip"));

        //创建输出流对象
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("F:\\原G盘\\2、中化明达\\打印机软件.zip"));

        //定义初始化\
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes)) != -1){
            out.write(bytes,0,len);
        }

        in.close();
        out.close();

        long end = System.currentTimeMillis();

        System.out.println((end - start));
    }

}
