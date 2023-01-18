package com.itea.andrii.lecture5.lesson5;

public class Fish implements Swim {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Я риба " + name + ". пливу, рухаючи плавниками.");
    }
}
