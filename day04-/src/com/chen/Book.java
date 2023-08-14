package com.chen;

public class Book {
    private int since = 1986;
    private String name = "西游记";
    public static String auther = "罗贯中";
    public Book(){
        System.out.println("无参数构造方法");
    }
    public void show(){
        System.out.println(name+since);
    }

    public String getName() {
        return name;
    }

    public int getSince() {
        return since;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setSince(int since) {
        this.since = since;
    }
}
