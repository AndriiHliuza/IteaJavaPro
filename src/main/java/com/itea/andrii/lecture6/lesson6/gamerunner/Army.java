package com.itea.andrii.lecture6.lesson6.gamerunner;

import com.itea.andrii.lecture6.lesson6.game_units.Soldier;

public class Army {
    protected int num = 99;
    protected Soldier[] soldiers;
    static int count = 0;

    public Army() {
        soldiers = new Soldier[num];
    }

    public boolean addSoldier(Soldier soldier) {
        if (count >= num) {
            return false;
        }
        soldiers[count] = soldier;
        count++;
        return true;
    }

    public int calcArmyHealth() {
        int armyHealth = 0;
        for (int i = 0; i < count; i++) {
            armyHealth += soldiers[i].getHealth();
        }
        return armyHealth;
    }
}
