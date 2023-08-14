package com.chen.generic;

import java.util.ArrayList;

public class Demo01 {

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();

        list.add("abc");
//        list.add(100);

        for (Object obj : list) {
            System.out.println(obj);
            String s = (String) obj;
            System.out.println(s);
        }

        //遍历输出
/*        for (String s : list) {
            System.out.println(s);
            System.out.println(s.length());
        }*/

    }

}
