package com.chen.liu;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream
                (new FileInputStream("E:\\LinuxShell\\新建文本文档.txt"));

        BufferedOutputStream out = new BufferedOutputStream
                (new FileOutputStream("E:\\MySQL\\新建文本文档.txt"));
/*        int len;
        while ((len = in.read()) != -1){
            out.write(len);
        }*/
        in.close();
//        out.close();

    }


}
