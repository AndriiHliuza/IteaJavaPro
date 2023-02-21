package com.itea.andrii.lecture14.lesson14;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Player> players = new TreeSet<>();

        Player tom = new Player("Tom", 1, 3, 5);
        Player jerry = new Player("Jerry", 3, 1, 3);
        Player donald = new Player("Donald", 2, 10, 0);

        players.add(tom);
        players.add(jerry);
        players.add(donald);
        players.add(new Player("Bill", 3, 1, 0));

        for (Player player : players) {
            System.out.println("Player: " + player);
        }
    }
}
