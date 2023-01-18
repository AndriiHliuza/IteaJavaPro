package com.itea.andrii.lecture5.lesson5;

public class BreakDanceDancer extends Dancer {
    public BreakDanceDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "Я танцюю брейк-данс!");
    }
}
