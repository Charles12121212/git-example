package com.chen.charnum;

//查找一段文本中，某个关键词出现的次数
public class HuiWenShi {
    public static void main(String[] args) {
        //要判断的句子
        String str = "人间四月芳菲尽，山寺桃花始盛开。\n" +
                "\n" +
                "长恨春归无觅处，不知转入此中来。啊!桃花好美呀!";
        //计数器
        int count = 0;
        //先找一遍
        int i = str.indexOf("桃花");
        //再往下找
        while (i != -1) {
            i = str.indexOf("桃花", i + 1);
            count++;
        }
        System.out.println(count);
        double b = Math.sqrt(25);
        System.out.println(b);
    }
}
