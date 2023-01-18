package com.itea.andrii.lecture5.lesson5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Антон", 18);
        Dancer breakDanceDancer = new BreakDanceDancer("Олексій", 19);
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Ігор", 20);


//        List<Dancer> discotheque = Arrays.asList(dancer, breakDanceDancer, electricBoogieDancer);
        Dancer[] discotheque = {
                dancer,
                breakDanceDancer,
                electricBoogieDancer
        };

        for (Dancer d : discotheque) {
            d.dance();
        }
    }
}
