package com.itea.andrii.lecture9.hometask9.task4;

import java.util.Random;

public class Tutor {
    private String name;

    public Tutor(String name) {
        this.name = name;
    }

    /**
     * Метод для виставлення оцінок викладачем
     * @return Оцінку, що виставив викладач
     */
    public double setGrade() {
        Random random = new Random();
        return random.nextDouble(60, 101);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
