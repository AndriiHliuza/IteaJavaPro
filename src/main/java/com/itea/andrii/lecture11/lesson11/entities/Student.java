package com.itea.andrii.lecture11.lesson11.entities;

public class Student extends Person {

    @Override
    public void hello() throws RuntimeException {
        System.out.println("I am student");
        throw new RuntimeException();
    }
}
