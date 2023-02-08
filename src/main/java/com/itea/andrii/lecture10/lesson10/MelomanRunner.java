package com.itea.andrii.lecture10.lesson10;

import java.util.Arrays;

public class MelomanRunner {
    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.CLASSIC;
        System.out.print(ms);

        switch (ms) {
            case JAZZ -> System.out.println(" is Jazz");
            case CLASSIC -> System.out.println(" is Classic");
            case ROCK -> System.out.println(" is Rock");
            default -> System.out.println(" Unknown music style: " + ms);
        }

        System.out.println(Arrays.toString(MusicStyle.values()));
        MusicStyle ms2 = MusicStyle.valueOf("Rock".toUpperCase());
    }
}
