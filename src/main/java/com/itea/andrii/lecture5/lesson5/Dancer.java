package com.itea.andrii.lecture5.lesson5;

public class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(toString() + "Я танцюю як всі.");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мені " + age + " років. ";
    }
}
