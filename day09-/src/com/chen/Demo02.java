package com.chen;

public class Demo02 {

    public static void main(String[] args) {

        System.out.println(count(3));
    }



    public static int count(int i){
        //定义第一组数据的大小
        int result = 0;
        if (i == 1){
            return result = 1;
        }
        if (i > 1){
            result = 2*count(i-1) + 1;
        }
        return result;
    }
}
