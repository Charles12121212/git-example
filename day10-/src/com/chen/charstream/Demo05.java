package com.chen.charstream;

import java.io.*;

public class Demo05 {
    public static void main(String[] args) throws IOException {

/*        BufferedOutputStream out =  new BufferedOutputStream(new FileOutputStream("day10-\\c.txt"));

        out.write(465465);
        out.write('s');*/

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("day10-\\c.txt"));
        int len;
        byte[] bytes = new byte[1];
        while ((len = in.read(bytes)) != -1){
            String s = new String(bytes,0,len);
            System.out.print(s);
        }
        System.out.println();
//        out.close();
        in.close();
    }


}
