package com.itea.andrii.lecture9.hometask9.task7;

public class Task7 {
    public static void main(String[] args) {
        Europe europe = new Europe();

        System.out.println(europe.addCountry("Ukraine", 603700));
        System.out.println(europe.addCountry("Poland", 322575));
        System.out.println(europe.addCountry("Germany", 357688));
        europe.showAllCountries();

        System.out.println("----------------");
        System.out.println(europe.changeSquareOfTheCountry("Germany", "Poland", 100000));
        System.out.println(europe.changeSquareOfTheCountry("Poland", "Germany", 20000));
        System.out.println(europe.changeSquareOfTheCountry("Germany", "Poland", 100000));
        System.out.println(europe.changeSquareOfTheCountry("Poland", "Germany", 1425754314));
        europe.showAllCountries();
    }
}
