package com.itea.andrii.lecture2.lesson2;

public class IfElse {
    public static void main(String[] args) {
        int a = 8;
        if (a < 10) {
            if (a < 5) {
                System.out.println("Число менше 5");
            } else {
                System.out.println("Число менше 10");
            }
        } else if (a < 20) {
            System.out.println("Число менше 20");
        } else {
            System.out.println("Число більше 20");
        }
    }
}
