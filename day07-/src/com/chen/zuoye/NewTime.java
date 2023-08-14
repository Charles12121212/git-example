package com.chen.zuoye;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NewTime {
    public static double getYears() {
        //LocalDateTime.of 输入自定义时间
        LocalDateTime firstEncounter = LocalDateTime.of(2023, 7, 15, 9, 00, 00, 000);
        //获取现在的时间
        LocalDateTime now = LocalDateTime.now();
        //获取时间间隔
        Duration pass = Duration.between(firstEncounter, now);
        //按天来接住
        double days = pass.toDays();
        //按秒来接住
        long seconds = pass.getSeconds();
        //转为字符串
        String str = Double.toString(days);
        //用BigDecimal来接住
        BigDecimal d = new BigDecimal(str);
        BigDecimal y = new BigDecimal("365");
        //计算差值
        BigDecimal result = d.divide(y, 3, RoundingMode.HALF_UP);
        //转换为double
        double v = result.doubleValue();
        //返回double值
        return v;
    }
}
