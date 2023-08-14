package com.chen;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println(num);
    }

}
