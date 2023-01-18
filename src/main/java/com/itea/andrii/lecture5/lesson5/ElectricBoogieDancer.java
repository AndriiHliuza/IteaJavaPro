package com.itea.andrii.lecture5.lesson5;

public class ElectricBoogieDancer extends Dancer {
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "Я танцюю електрк бугі!");
    }
}
