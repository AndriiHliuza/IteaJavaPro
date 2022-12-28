package com.itea.andrii.lecture1.hometask1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*  1. Напишіть програму яка, в методі main оголошує такі змінні
            name типу String
            age типу int
            city типу String
        */
        String name;
        int age;
        String city;


        /*  2. Написати програму, що виводить на екран рік народження мого друга.
            Наразі 2022 рік. Мій друг народився 18 років тому.
        */
        int currentYear = 2022;
        int ageOfFriend = 18;
        System.out.println("Мій друг народився в " + (currentYear - ageOfFriend) + " році");


        // 3. Напишіть програму яка виводить на екран напис: Привіт, друже
        String message = "Привіт, друже";
        System.out.println(message);

        String informationAboutFriend = "Мій друг народився в " + (currentYear - ageOfFriend) + " році";
        JOptionPane.showMessageDialog(null, message + "\n" + informationAboutFriend);
    }
}