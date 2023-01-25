package com.itea.andrii.lecture7.lesson7;

public class UnusualCar implements Car {
    @Override
    public void gas() {
        Car.super.gas();
        System.out.println("Ця машина газує по-другому!");
    }

    @Override
    public void brake() {
        Car.super.brake();
        System.out.println("Ця машина тормозить по-другому!");
    }
}
