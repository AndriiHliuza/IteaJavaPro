package com.itea.andrii.lecture6.lesson6;

public abstract class CarTransportationCosts extends CarCost {

    @Override
    public double countTransportationCosts(String country) {
        if (country.compareTo("Ukraine") == 0) {
            return 3.000;
        }
        if (country.compareTo("England") == 0) {
            return 2.000;
        }

        return -1.0;
    }
}
