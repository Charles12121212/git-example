package com.chen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    private static Object date;

    public static void main(String[] args) throws ParseException {
/*        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf);
        String s1 = sdf.format(date);
        System.out.println(s1);*/

/*        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String str = sdf.format(date);
        System.out.println(str);*/

/*        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String s = sdf.format(date);
        System.out.println(s);*/

/*        String str = "2023-07-24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        System.out.println(date);*/
/*
        String s = "2023年07月24日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        date = sdf.parse(s);
        System.out.println(date);*/

        date = new Date();
        System.out.println(date);




    }
}
