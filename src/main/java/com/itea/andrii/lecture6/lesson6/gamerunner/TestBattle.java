package com.itea.andrii.lecture6.lesson6.gamerunner;

import com.itea.andrii.lecture6.lesson6.game_units.General;
import com.itea.andrii.lecture6.lesson6.game_units.Sergeant;
import com.itea.andrii.lecture6.lesson6.game_units.Soldier;

import java.util.Random;

public class TestBattle {
    Soldier soldier1 = new Soldier("солдат");
    Soldier soldier2 = new Soldier("солдат");
    Sergeant sergeant = new Sergeant("Сержант");
    General general = new General("Генерал");

    public TestBattle() {
        battle(sergeant, general);
    }


    public void battle(Soldier soldier1, Soldier soldier2) {
        Random gen = new Random();
        while (soldier1.isAlive() && soldier2.isAlive()) {
            soldier1.hit(soldier2, gen.nextInt(100));
            if (soldier2.isAlive()) {
                soldier2.hit(soldier1, gen.nextInt(100));
            }
        }

        if (!soldier1.isAlive()) {
            System.out.println("Кінець бою. Переміг " + soldier2);
        } else {
            System.out.println("Кінець бою. Переміг " + soldier1);
        }
    }

    public static void main(String[] args) {
        new TestBattle();
    }
}
