package com.chen;

public class AddableDemo {

    public static void main(String[] args) {
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y ;
            }
        });

        useAddable((int x , int y) -> {
            return x + y;
        });

    }

    public static void useAddable(Addable a){
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
