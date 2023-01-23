package com.itea.andrii.lecture6.lesson6;

public class UkrainePrice extends CarTransportationCosts {

    @Override
    public double countLocalCost() {
        double enLocalCosts = 14000.00;
        double price = countPrimeCost() + countTransportationCosts("Ukraine") + enLocalCosts;
        return price;
    }
}
