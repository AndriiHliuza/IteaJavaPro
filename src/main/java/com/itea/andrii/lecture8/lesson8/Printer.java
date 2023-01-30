package com.itea.andrii.lecture8.lesson8;

public class Printer {

    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
