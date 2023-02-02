package com.itea.andrii.lecture9.lesson9.ships;

public class RunnerShip {
    public static void main(String[] args) {
        Ship.LifeBoat.down();

        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();

        lifeBoat.swim();
    }
}
