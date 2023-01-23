package com.itea.andrii.lecture6.lesson6.game_units;

public class Sergeant extends Soldier {
    public Sergeant(String rank) {
        super(rank);
        health = health * 10;
        System.out.println("Здоров'я сержанта збільшено в 10 раз");
    }
}
