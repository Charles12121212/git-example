package com.chen.test1;

import sun.security.provider.Sun;

/*
某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
现在算起来，他一共吹熄了236根蜡烛。 请问，他从多少岁开始过生日party的？
 */
public class Party {

    public static void main(String[] args) {



        //假设从1岁开始,如果不对,从两岁开始
        loop:
        for (int i = 1; i <= 236; i++) {
            int sum = 0;
            //从i+1每年开始加
            for (int j = i + 1; j < 236; j++) {
                sum += i + j;
                //判断大于236,退出当前循环,继续上一个循环
                if (sum > 236) {
                    break ;
                }
                //等于236,退出loop循环
                if (sum == 236) {
                    System.out.println(i);
                    break loop;
                }
            }
        }
    }

}
