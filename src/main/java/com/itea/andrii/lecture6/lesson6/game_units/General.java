package com.itea.andrii.lecture6.lesson6.game_units;

public class General extends Soldier {
    private String slogan = "Ніколи не здаватись";

    public General(String rank) {
        super(rank);
        health = health  * 100;
        System.out.println("Здоров'я генерала збільшено у 100 разів");
    }

    @Override
    public String toString() {
        return "Генерал із здоров'ям " + super.health + " його лозунг: " + slogan;
    }

    public String getSlogan() {
        return slogan;
    }
}
