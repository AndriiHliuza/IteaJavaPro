package com.itea.andrii.lecture5.lesson5;

public class Human implements Swim {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(toString() + "Я плаваю за допомогою надувного кола.");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мені " + age + " років. ";
    }
}
