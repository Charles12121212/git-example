package com.chen.charnum;

public class CharNum {

    public static void main(String[] args) {
        String str = "f4sd65fFFF";
        int count = 0;
        int num = str.length();
        System.out.println(num);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >=  'a' && ch <= 'z'){
                count++;
            }
            if (ch >=  'A' && ch <= 'Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
