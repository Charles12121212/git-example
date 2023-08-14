package com.chen.database;

import java.util.Objects;

public class DataBase{

    //用户名数据库
    private String name = "Tom,Jerry";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

    }


    //无参构造
    public DataBase() {
    }

    //有参构造
    public DataBase(String name) {
        this.name = name;
    }

    //get方法
    public String getName() {
        return name;
    }

    //set方法
    public void setName(String name) {
        this.name = name;
    }



/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBase dataBase = (DataBase) o;
        return name != null ? name.equals(this.name) : this.name == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "name='" + name + '\'' +
                '}';
    }*/
}
