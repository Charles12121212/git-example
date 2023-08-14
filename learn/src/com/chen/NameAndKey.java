package com.chen;

public class NameAndKey {
    //用户信息
    private String name = "陈代权";
    private int key = 123456;

    public String setName(String name) {
        //判断用户名是否正确
        if (this.name == name) {
            System.out.println("用户名输入正确,成功登陆");
        }else{
            System.out.println("用户名输入错误");
        }
        return this.name;
    }

    public int setKey(int key) {
        //判断密码是否正确
        if(this.key == key){
            System.out.println("密码输入正确,成功登陆");
        }else{
            System.out.println("密码输入错误");
        }
        return this.key;
    }


}
