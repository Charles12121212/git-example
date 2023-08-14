package com.chen;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {

    public static void main(String[] args) {

        // 键盘
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文本：");
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //存在又加一
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                //首次出现,就等于1
                map.put(c, 1);
            }

//            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);

        }
        map.forEach((k, v) -> System.out.println(k + "=" + v));
        map.forEach((k, v) -> System.out.println("字符：" + k + "出现的次数是：" + v));

    }

}
