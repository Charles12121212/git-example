package com.chen;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.show();
        String auther = Book.auther;
        String name = b.getName();
        System.out.println(auther);
        System.out.println(name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
