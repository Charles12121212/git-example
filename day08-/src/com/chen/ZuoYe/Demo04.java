package com.chen.ZuoYe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"中国","荷兰","厄瓜多尔",
                "威尔士", "美国", "墨西哥", "丹麦", "德国",
                "克罗地亚", "沙特", "澳大利亚", "乌拉圭",
                "卡塔尔", "英格兰", "哥斯达黎加", "加拿大");
        Random r = new Random();

        //随机抽取
        for (int i = 0; i < 4; i++) {
            System.out.print("第" + (i+1) + "组的成员如下:");
            //每组抽取四个
            for (int i1 = 0; i1 < 4; i1++) {
                int index = r.nextInt(list.size());
                //抽到谁,删除谁
                String s = list.remove(index);
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }
}
