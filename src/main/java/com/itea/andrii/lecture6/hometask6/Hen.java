package com.itea.andrii.lecture6.hometask6;

import java.util.Objects;

public abstract class Hen {
    protected String country;
    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я курка";
    }

    public String getCountry() {
        return country;
    }
}
