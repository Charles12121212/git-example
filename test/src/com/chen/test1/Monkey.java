package com.chen.test1;

/*
有一群猴子，摘到若干个桃子，当即吃了一半，还不过瘾，又多吃了一个；
第二天又将剩下的桃子吃掉一半，又多吃了一个。
以后每天都吃掉前一天剩下的一半零一个。
到第10天想再吃时，见只剩下一个桃子了。求第一天共摘了多少？
 */
public class Monkey {
    public static void main(String[] args) {

        int num = 1;
        for (int i = 1; i < 10; i++) {
            num = (num + 1) * 2;
            System.out.println("第"+ (10-i)+ "天的数量为:"+num);
        }
        System.out.println("第一天共摘了多少:"+(2*(num+1)));
    }
/*    private int num(int i){
        num(i) = (i+1)*2;
        return i;
    }*/


}
