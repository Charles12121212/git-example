package com.chen;

public class EatableImpl {

    public static void main(String[] args) {
        useEatable(new Eatable(){
            @Override
            public void eat(){
                System.out.println("吃面包");
            }
        });

        //lamda
        useEatable(() -> { System.out.println("喝牛奶"); });
    }


    public static void useEatable(Eatable eatable){
        eatable.eat();
    }
}



