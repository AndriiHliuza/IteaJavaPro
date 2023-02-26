package com.itea.andrii.lecture9.hometask9.task8;

public class Task8 {
    public static void main(String[] args) {
        City city = new City("Київ", 5000000);

        System.out.println(city.addStreet("Хрещатик"));
        System.out.println(city.addStreet("Хрещатик"));
        System.out.println(city.addSquare("Бессарабська площа"));
        System.out.println(city.addAvenue("Степана Бандери"));
        System.out.println(city.addAvenue("Броварський"));


        System.out.println(city.getStreets());
        System.out.println(city.getSquares());
        System.out.println(city.getAvenues());
    }
}
