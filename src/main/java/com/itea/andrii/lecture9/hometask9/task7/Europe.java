package com.itea.andrii.lecture9.hometask9.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Europe {
    private final List<Country> countries = new ArrayList<>();
    private class Country {
        private final String name; // назва країни
        private double square; // площа країни
        private boolean isExist = true;

        private final List<Double> historyOfTerritorialDivision = new ArrayList<>();

        public Country(String name, double square) {
            this.name = name;
            this.square = square;
            historyOfTerritorialDivision.add(square);
        }

        public void addSquareToCountry(double squareToAdd) {
            square += squareToAdd;
            historyOfTerritorialDivision.add(square);
        }

        public void removeSquareFromCountry(double squareToRemove) {
            square -= squareToRemove;
            historyOfTerritorialDivision.add(square);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Country country = (Country) o;
            return Objects.equals(name, country.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    ", square=" + square +
                    ", isExist=" + isExist +
                    ", historyOfTerritorialDivision=" + historyOfTerritorialDivision +
                    '}';
        }
    }

    public boolean addCountry(String countryName, double squareOfTheCountry) {
        if (squareOfTheCountry > 0) {
            Country country = new Country(countryName, squareOfTheCountry);
            if (!countries.contains(country)) {
                countries.add(country);
                return true;
            }
        }
        return false;
    }

    public boolean changeSquareOfTheCountry(String firstCountryName, String secondCountryName, double square) {
        if (square > 0) {
            Country firstCountry = new Country(firstCountryName, square);
            Country secondCountry = new Country(secondCountryName, square);
            if (countries.contains(firstCountry) && countries.contains(secondCountry)) {
                Country country1 = countries.get(countries.indexOf(firstCountry));
                Country country2 = countries.get(countries.indexOf(secondCountry));
                if (country2.square >= square) {
                    country1.addSquareToCountry(square);
                    country2.removeSquareFromCountry(square);
                } else {
                    country1.addSquareToCountry(country2.square);
                    country2.removeSquareFromCountry(country2.square);
                }
                if (country2.square == 0) {
                    country2.isExist = false;
                }
                return true;
            }
        }
        return false;
    }

    public void showAllCountries() {
        countries.forEach(System.out::println);
    }
}
