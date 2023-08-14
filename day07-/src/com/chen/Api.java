package com.chen;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Api {
    public static void main(String[] args) {

        System.out.println("aaa");
        System.err.println("bbb");

        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());

        int year = date.getYear();

        String str = "666";
        char[] chars = str.toCharArray();
        System.out.println(chars);

        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = time.format(date);
        System.out.println(format);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime of = LocalDateTime.of(2023, 12, 12, 12, 12, 12);
        System.out.println(of);
        System.out.println(LocalDateTime.now());

        LocalDateTime localDateTime = now.plusDays(100);
        System.out.println(localDateTime);

        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        StringBuilder sb = new StringBuilder();

        String ss = "666p";
        int i = Integer.parseInt(ss);
        System.out.println(i);

        int ii = 999;
        String s = Integer.toString(ii);
        System.out.println(s);

        double d = 15.0000000000000000;
        double c = 15.0;
        System.out.println(d/c);
        int compare = Integer.compare(i, ii);
        System.out.println(compare);
    }
}
