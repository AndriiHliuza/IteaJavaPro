package com.itea.andrii.lecture9.hometask9.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City {
    private String name;
    private double population;
    private List<Street> streets = new ArrayList<>();
    private List<Square> squares = new ArrayList<>();
    private List<Avenue> avenues = new ArrayList<>();

    public City(String name, double population) {
        this.name = name;
        this.population = population;
    }

    private class Street {
        private String name;

        public Street(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Street street = (Street) o;
            return Objects.equals(name, street.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private class Square {
        private String name;

        public Square(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Square square = (Square) o;
            return Objects.equals(name, square.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
        @Override
        public String toString() {
            return name;
        }
    }

    private class Avenue {
        private String name;

        public Avenue(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Avenue avenue = (Avenue) o;
            return Objects.equals(name, avenue.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public boolean addStreet(String name) {
        Street street = new Street(name);
        return !streets.contains(street) && streets.add(street);
    }
    public boolean addSquare(String name) {
        Square square = new Square(name);
        return !squares.contains(square) && squares.add(square);
    }
    public boolean addAvenue(String name) {
        Avenue avenue = new Avenue(name);
        return !avenues.contains(avenue) && avenues.add(avenue);
    }

    public List<Street> getStreets() {
        return streets;
    }

    public List<Square> getSquares() {
        return squares;
    }

    public List<Avenue> getAvenues() {
        return avenues;
    }
}
