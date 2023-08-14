package com.chen.jic;

public class AnimalsTest {
    public static void main(String[] args) {
        Animals a = new Cat();
        a.setName("tom");
        a.eat();
        System.out.println(a.getName());
        Cat c = (Cat) a;
        c.eat();
    }
}
