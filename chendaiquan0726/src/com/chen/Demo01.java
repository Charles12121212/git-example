package com.chen;

public class Demo01 {
    public static void main(String[] args) {
        //新建字符串
        String s = "人间四月芳菲尽，山寺桃花始盛开；" +
                "崔护在《题都城南庄》中说：人面不知何处去，桃花依旧笑春风；" +
                "王维在《桃源行》中说：渔舟逐水爱山春，两岸桃花夹古津...春来遍是桃花水，不辨仙源何处寻；" +
                "唐寅在《桃花庵歌》中也描述：桃花坞里桃花庵，桃花庵里桃花仙。桃花仙人种桃树，又摘桃花换酒钱...";
        //初始化变量
        int count = 0;
        //根据索引判断
        for (int index = 0; index < s.length() - 1; index++) {
            if (s.indexOf("桃花", index) == index) {
                count++;
            }
        }
        //打印
        System.out.println("桃花出现的次数为:" + count + "次");
    }

}
