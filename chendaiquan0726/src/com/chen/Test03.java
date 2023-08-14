package com.chen;

import java.util.ArrayList;
import java.util.zip.ZipEntry;

public class Test03 {

    public static void main(String[] args) {
        //复制字符串
        String s = "the quick brown fox jumps over the lazy dog";
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //遍历s字符串,赋值
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

        //第一个单独转
        char c = capitalized(sb.charAt(0));
        sb.insert(0, c);
        sb.delete(1, 2);

        //遍历字符串
        for (int i = 0; i < sb.length(); i++) {

            //判断遇到空格,下一个就变大写
            if (sb.charAt(i) == ' ') {
                //将大小写转换
                char ch = capitalized(sb.charAt(i + 1));
                sb.insert(i + 1, ch);
            }
        }
        System.out.println(sb);
    }

    //小写变大写的方法
    public static char capitalized(char c) {
        int i = 'A' - 'a';
        c = (char) (c + i);
        return c;
    }
}
