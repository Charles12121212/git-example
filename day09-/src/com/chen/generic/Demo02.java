package com.chen.generic;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
//        Class<?> clazz = Class.forName(com.chen.Student);
        ArrayList<Father> list1 = new ArrayList<>();
        testBounds(list1);

        ArrayList<GrandFather> list2 = new ArrayList<>();
        testBounds(list2);

        ArrayList<Son> list3 = new ArrayList<>();
//        testBounds(list3);




    }
    public static <T> void testBounds(ArrayList<? super Father> list){

    }


}

class GrandFather {
}

class Father extends GrandFather {
}

class Son extends Father {
}