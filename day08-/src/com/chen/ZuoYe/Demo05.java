package com.chen.ZuoYe;

import java.util.*;

public class Demo05 {
    /*
            LinkedList<String> list = new LinkedList<>();
            list*/
    public static void main(String[] args) {
        //创建集合对象
//        HashSet<String> set = new HashSet<String>();
        TreeSet<String> set = new TreeSet<>();
        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包含重复元素的集合
        set.add("world");
        set.add("world");

//        Collections.shuffle(set);
        //遍历
        for (String s : set) {
            System.out.println(s);
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //创建list集合
        ArrayList<String> list = new ArrayList<>();
        //创建两个数组
        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //给集合赋值
        for (String s1 : color) {
            for (String s2 : num) {
                list.add(s1 + s2);
            }
        }
        list.add("大王");
        list.add("小王");
        Collections.shuffle(list);

        //给三个人发牌,留三张底牌
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                list1.add(list.get(i));
            }
            if (i % 3 == 1) {
                list2.add(list.get(i));
            }
            if (i % 3 == 2) {
                list3.add(list.get(i));
            }
        }
        System.out.println("高进的牌为:" + list1 + "\t");
        System.out.println("龙五的牌为:" + list2 + "\t");
        System.out.println("阿星的牌为:" + list3 + "\t");

        list3.forEach(s -> System.out.println(s));
        list2.forEach(s -> System.out.println("龙五的牌为:"+s));

        System.out.print("底牌：");
        for (int i = list.size() - 3; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }

}
