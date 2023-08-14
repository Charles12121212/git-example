package com.chen.thread3.thread4;

public class Tickeys01 {

    public static void main(String[] args) {

        MyTivkeys myTivkeys = new MyTivkeys();

        new Thread(myTivkeys,"窗口1").start();
        new Thread(myTivkeys,"窗口2").start();


    }



}
