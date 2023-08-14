package com.chen.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Demo01 {

    public static void main(String[] args) throws IOException {

        //创建输出流对象 指向文件\
        //创建输出流时,如果文件不存在,那么会自动创建
        //如果文件存在,那么会清空写入
        //如果需要追加写入,打逗号写ture
        //4.文件所在目录必须存在
        FileOutputStream out = new FileOutputStream("day10-\\a.txt");

        //写入数据
        out.write(97);
        out.write(98);
        out.write(99);
        out.write(100);

        //写出字节数组
        byte[] bytes = {122,121,120,119,118};
        out.write(bytes);

        //xieyibufeng
        out.write(bytes,0,3);

        //字符串转成字节来转
        String s = "hello";
        out.write(s.getBytes(StandardCharsets.UTF_8));

        //释放资源
        out.close();  //必须要做的!!!!!!


    }

}
