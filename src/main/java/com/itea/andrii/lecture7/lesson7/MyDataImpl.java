package com.itea.andrii.lecture7.lesson7;

public class MyDataImpl implements MyData {

    public boolean isNull(String str) {
        System.out.println("Перевіряємо на null");
        return str == null ? true : false;
    }
    public static void main(String[] args) {
        MyDataImpl myData = new MyDataImpl();
        myData.print("");
        myData.isNull("abc");
    }
}
