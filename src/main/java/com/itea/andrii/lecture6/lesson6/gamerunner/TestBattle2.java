package com.itea.andrii.lecture6.lesson6.gamerunner;

import com.itea.andrii.lecture6.lesson6.game_units.General;
import com.itea.andrii.lecture6.lesson6.game_units.Sergeant;
import com.itea.andrii.lecture6.lesson6.game_units.Soldier;

import java.util.Random;

public class TestBattle2 {
    Sergeant sergeant = new Sergeant("Сержант");
    General general = new General("Генерал");

    Soldier[] soldiers = new Soldier[100];

    Army army = new Army();

    public TestBattle2() {
        soldiers[0] = new Soldier("Солдат");
        soldiers[1] = new Soldier("Солдат");
        soldiers[2] = new Soldier("Солдат");
        soldiers[3] = new Soldier("Солдат");

        army.addSoldier(battle(sergeant, general));
        army.addSoldier(battle(soldiers[0], soldiers[1]));
        army.addSoldier(battle(soldiers[2], soldiers[3]));

        System.out.println("Army's health = " + army.calcArmyHealth());
    }

    public Soldier battle(Soldier soldier1, Soldier soldier2) {
        Random gen = new Random();
        while (soldier1.isAlive() && soldier2.isAlive()) {
            soldier1.hit(soldier2, gen.nextInt(100));
            if (soldier2.isAlive()) {
                soldier2.hit(soldier1, gen.nextInt(100));
            }
        }

        if (!soldier1.isAlive()) {
            System.out.println("Кінець бою. Переміг " + soldier2);
            return soldier2;
        } else {
            System.out.println("Кінець бою. Переміг " + soldier1);
            return soldier1;
        }
    }

    public static void main(String[] args) {
        new TestBattle2();
    }
}
