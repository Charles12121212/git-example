package com.chen;

import java.util.Random;

public class test {

    public  static  String getCheckCode(){
        StringBuilder sb = new StringBuilder();
        for (int i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            sb.append(i);
        }
        for (int i = '0'; i <= '9'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        String result = "";
        //随机四次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
        }
        return null;
    }

}
