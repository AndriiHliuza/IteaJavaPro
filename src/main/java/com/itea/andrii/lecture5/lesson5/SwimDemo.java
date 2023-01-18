package com.itea.andrii.lecture5.lesson5;

public class SwimDemo {
    public static void main(String[] args) {
        Swim human = new Human("Антон", 6);
        Swim fish = new Fish("Короп");
        Swim boat = new UBoat(25);

        Swim[] swimmers = {
                human,
                fish,
                boat
        };

        for (Swim s : swimmers) {
            s.swim();
        }
    }
}
