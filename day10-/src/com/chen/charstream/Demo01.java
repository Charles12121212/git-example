package com.chen.charstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo01 {
    public static void main(String[] args){
        FileOutputStream out = null;
        try {
            //创建输出流
            out = new FileOutputStream("day10-\\a.txt");
            //写出数据
            out.write("hello 字节流 我们来了!!!".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //必须要执行的代码放在这
            //关流 close方法的异常 再次处理
            //如果刘对象
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
