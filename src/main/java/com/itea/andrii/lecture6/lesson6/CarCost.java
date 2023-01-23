package com.itea.andrii.lecture6.lesson6;

public abstract class CarCost {

    public double countPrimeCost() {
        return 50000;
    }

    public abstract double countTransportationCosts(String country);

    public abstract double countLocalCost();
}
