package com.chen;

public class FlyableDemo {
    public static void main(String[] args) {
        String s = "吃大便";
        //在主方法中调用useFlyable方法
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println("飞机自驾游");
            }
        },s);

        useFlyable((String s1)  ->  {System.out.println("答辩不好吃"); },s);

    }



    public static void useFlyable(Flyable f,String s) {
        f.fly("风和日丽");
    }
}
