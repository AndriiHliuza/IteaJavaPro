package com.itea.andrii.lecture11.lesson11.entities;

public class Main {
    public static void main(String[] args) {
        try {
            new Person().hello();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        new Student().hello();
    }
}
