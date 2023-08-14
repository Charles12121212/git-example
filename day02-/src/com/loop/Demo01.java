package com.loop;

public class Demo01 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
                System.out.println("数值分别为:"+i);
                count++;
            }
        }
        System.out.println("数量为:"+count);
    }
}
