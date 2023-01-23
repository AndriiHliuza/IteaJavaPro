package com.itea.andrii.lecture6.lesson6;

public class EnglandPrice extends CarTransportationCosts {

    @Override
    public double countLocalCost() {
        double enLocalCosts = 15800.00;
        double price = countPrimeCost() + countTransportationCosts("England") + enLocalCosts;
        return price;
    }
}
