package com.chen;

/*
某牛从某年开始每年都举办一次生日party，
并且每次都要吹熄与年龄相同根数的蜡烛。
现在算起来，他一共吹熄了236根蜡烛。 请问，他从多少岁开始过生日party的？
 */
public class Test01 {
    public static void main(String[] args) {
        //做个标记
        int result = 0;
        //假设从1岁开始,如果不对,从两岁开始
        loop:for (int i = 1; i <= 236; i++) {
            int sum = 0;
            //从i+1每年开始加
            for (int j = i + 1; j < 236; j++) {
                sum += j;
                //判断大于236,退出当前循环,继续上一个循环
                if (sum > 236) {
                    break;
                }
                //等于236,退出loop循环,标记改变
                if (sum == 236) {
                    result++;
                    System.out.println("他是从第" + (i+1) + "岁开始过生日的");
                    break loop;
                }
                //如果循环到最后一次,直接输出
            }
        }
        //循环结束,如果标记没有改变,输出
        if (result == 0){
            System.out.println("没找到结果");
        }
    }
}
