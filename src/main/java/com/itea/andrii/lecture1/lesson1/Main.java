package com.itea.andrii.lecture1.lesson1;

public class Main {

    String myString1 = new String("The weather was fine");
    String myString2 = "The weather was fine";

    public static void main(String[] args) {
        System.out.println("Hello world!");

        char symb1 = 65;
        char symb2 = 'A';
        System.out.println(symb1);
        System.out.println(symb2);

        char ch = 'J';
        int intCh = ch;

        System.out.println("J = " + intCh);

        String s1 = "I have ";
        String s2 = " apples";

        int num = 3;
        String s = s1 + num + s2;

        System.out.println(s);
    }
}