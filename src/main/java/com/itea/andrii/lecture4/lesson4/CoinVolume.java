package com.itea.andrii.lecture4.lesson4;

public class CoinVolume {
    public static void main(String[] args) {
        Safe mySafe1 = new Safe(10, 15, 20);
//        mySafe1.setSafeVolume(10, 15, 20);
//        mySafe1.width = 10;
//        mySafe1.height = 15;
//        mySafe1.depth = 20;
//
//        mySafe1.safeVolume = mySafe1.width * mySafe1.height * mySafe1.depth;

        Safe mySafe2 = new Safe(15, 20, 15);
//        mySafe2.setSafeVolume(15, 20, 15);
//        mySafe2.width = 15;
//        mySafe2.height = 20;
//        mySafe2.depth = 15;
//
//        mySafe2.safeVolume = mySafe2.width * mySafe2.height * mySafe2.depth;

//        System.out.println("Об'єм 1-го сейфу: " + mySafe1.safeVolume);
//        System.out.println("Об'єм 2-го сейфу: " + mySafe2.safeVolume);

//        System.out.println("Об'єм 1-го сейфу: " + mySafe1.getSafeVolume());
//        System.out.println("Об'єм 2-го сейфу: " + mySafe2.getSafeVolume());

        printSafeVolume(mySafe1, 1);
        printSafeVolume(mySafe2, 2);
    }

    static void printSafeVolume(Safe safe, int number) {
        System.out.println("Об'єм " + number + "-го сейфу: " + safe.getSafeVolume());
    }
}
