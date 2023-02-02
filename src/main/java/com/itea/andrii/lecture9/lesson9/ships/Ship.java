package com.itea.andrii.lecture9.lesson9.ships;

public class Ship {
    private int id;

    public static class LifeBoat {
        private int boatId;

        public static void down() {
            System.out.println("шлюпки на воду");
        }

        public void swim() {
            System.out.println("відплиття шлюпки");
        }
    }
}
