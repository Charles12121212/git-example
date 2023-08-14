package com.chen.charstream;

import java.io.*;

public class Demo06 {
    public static void main(String[] args) throws IOException {

/*        BufferedReader read = new BufferedReader(new FileReader("day10-\\c.txt"));
        System.out.println(read.lines());

        String line;
        while ((line = read.readLine()) != null){
            System.out.print(line);
        }*/
//        read.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("day10-\\c.txt",true));

        writer.write("我是真的很牛逼!!!!!!!");

        writer.newLine();

        writer.write("在重复一遍!!!我是真的很牛逼!!!!!!!");
        writer.write("在重复一遍!!!我是真的很牛逼!!!!!!!");

        writer.close();


    }


}
