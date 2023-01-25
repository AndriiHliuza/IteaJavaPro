package com.itea.andrii.lecture7.lesson7;

public class Main {
    public static void main(String[] args) {
        F1Car f1Car = new F1Car();
        Sedan sedan = new Sedan();
        Truck truck = new Truck();

        truck.gas();
        sedan.gas();
        f1Car.brake();
    }
}
