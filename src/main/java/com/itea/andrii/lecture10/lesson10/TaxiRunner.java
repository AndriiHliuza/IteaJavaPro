package com.itea.andrii.lecture10.lesson10;

public class TaxiRunner {
    public static void main(String[] args) {
        var ts = TaxiStation.valueOf(TaxiStation.class, "Volvo".toUpperCase());

        System.out.println(ts + " : ordinal -> " + ts.ordinal());

        ts.setFreeCabs(3);

        var stations = TaxiStation.values();

        for (var element : stations) {
            System.out.println(element);
        }
    }
}
