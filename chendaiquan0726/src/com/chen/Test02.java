package com.chen;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test02 {
    public static void main(String[] args) {
        //输入固定的时间 打点加1000天
        LocalDate ld = LocalDate.of(2022,12,12).plusDays(1000);
        //字符串接住格式化以后的时间
        String df = ld.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        //打印
        System.out.println("这货预言的世界末日是:"+df);
    }
}
