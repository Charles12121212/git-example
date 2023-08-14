package com.chen;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {

 /*       File f = new File("文件路径");
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());

        */

        System.out.println(getjc(5));

    }

    public static int getjc(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1){
            return  1;
        }
        return n*getjc(n-1);
    }
}
