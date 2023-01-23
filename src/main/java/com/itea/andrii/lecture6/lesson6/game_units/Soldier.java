package com.itea.andrii.lecture6.lesson6.game_units;

import java.util.Random;

public class Soldier {
    protected int health;
    protected boolean alive;
    protected int defense;
    protected static int count;
    private int id;
    protected String rank;

    public Soldier(String rank) {
        this.rank = rank;

        id = ++count;
        health = 100;
        alive = true;
        Random randomGen = new Random();
        defense = randomGen.nextInt(50);
        System.out.println(rank + " №" + id + " is created: health = " + health + ", defense = " + defense);

    }

    public int getHealth() {
        return health;
    }

    private void receiveHit(int hit) {
        if (isAlive() == true) {
            int damage = hit - defense;
            if (damage > 0) {
                health = health - damage;
            } else {
                System.out.println("Удар занадто слабкий " + hit);
                return;
            }
            if (health <= 0) {
                alive = false;
                System.out.println("[X] " + rank + " №" + id + " отримав пошкодження " + damage + " і героїчно загинув");
            } else {
                System.out.println("[X] " + rank + " №" + id + " отримав пошкодження " + damage + ". Залишилось здоров'я " + health);
            }
        }


    }


    public void hit(Soldier targetSoldier, int hit) {
        targetSoldier.receiveHit(hit);
    }

    public boolean isAlive() {
        return alive;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return rank + " №" + id + ": здоров'я = " + health + ", захист = " + defense;
    }
}
