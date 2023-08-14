package com.chen;

public class GenericDemo1 {

    public static void main(String[] args) {
        Generic<String> g1 = new Generic<>();
        g1.setT("BigData");
        g1.setT("我是真6逼");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<>();

    }


}
