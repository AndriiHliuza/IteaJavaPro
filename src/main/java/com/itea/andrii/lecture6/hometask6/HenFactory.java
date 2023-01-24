package com.itea.andrii.lecture6.hometask6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HenFactory {
    private final List<Hen> hens;

    public HenFactory(Hen ...hens) {
        this.hens = Arrays.stream(hens).toList();
    }

    /**
     * Returns ArrayList of countries
     * @return ArrayList of countries
     */
    public List<String> getHen() {
        return hens.stream()
                .map(Hen::getCountry)
                .distinct().toList();
    }

    /**
     * Returns country of this type of hen
     * @param hen type of hen
     * @return country of this type of hen
     */
    public String getHen(Hen hen) {
        return hen.getCountry();
    }
}
