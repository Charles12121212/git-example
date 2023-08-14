package com.chen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;

/*
请按照 yyyy-MM-dd 的格式输入一个人的生日（无需校验，按照正确格式输入即可），
帮助他计算截至今天，他一共活了多少天，输出一个整数即可。

例如，假设今天是2023年5月10日，
输入：2023-05-05
输出：5
 */
public class Test02 {
    public static void main(String[] args) {
        //输入时间
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入时间,按照yyyy-MM-dd格式:");
        String s = sc.nextLine();
        // 将生日字符串按照日期格式解析
        LocalDate birthday = LocalDate.parse(s);
        // 获取今天的日期
        LocalDate today = LocalDate.now();
        // 计算生日至今天的天数差
        Period period = Period.between(birthday, today);
        int i = period.getDays();
        // 输出结果
        System.out.println(i);
    }
}
