package com.chen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo04 {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        System.out.println(str);

        String s1 = "2023-07-25 16:55:37";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf1.parse(s1);
        System.out.println(d1);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);


    }
}
