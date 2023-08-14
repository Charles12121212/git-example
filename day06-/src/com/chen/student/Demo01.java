package com.chen.student;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo01 {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("10");
        BigDecimal y = new BigDecimal("3.0");
/*        BigDecimal z = x.add(y);
        double v = z.doubleValue();*//*
        System.out.println(z);
        System.out.println(v);*/
        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        System.out.println(x.multiply(y));
        System.out.println(x.divide(y,20, RoundingMode.DOWN));
        System.out.println(x.divide(y,50));

    }
}
