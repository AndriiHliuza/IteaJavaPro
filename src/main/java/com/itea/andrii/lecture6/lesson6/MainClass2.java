package com.itea.andrii.lecture6.lesson6;

import java.util.Scanner;

public class MainClass2 {
    Scanner scanner;
    CarCost carCost;

    public MainClass2() {
        scanner = new Scanner(System.in);
        System.out.print("Введіть назву країни: ");
        String country = scanner.nextLine();

        if (country.equalsIgnoreCase("Ukraine") || country.equalsIgnoreCase("Україна")) {
            carCost = new UkrainePrice();
        } else if (country.equalsIgnoreCase("England") || country.equalsIgnoreCase("Англія")) {
            carCost = new EnglandPrice();
        } else {
            System.out.println("Інформація про введену країну відсутня!");
            return;
        }
        System.out.println("Ціна автомобіля (" + country + "): " + carCost.countLocalCost());
    }

    public static void main(String[] args) {
        new MainClass2();
    }
}
