package com.itea.andrii.lecture7.lesson7;

public interface Car {
    default void gas() {
        System.out.println("Газ!");
    }
    default void brake() {
        System.out.println("Тормоз!");
    }
}
