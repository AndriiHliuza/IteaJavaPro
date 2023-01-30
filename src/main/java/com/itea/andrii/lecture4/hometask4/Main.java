package com.itea.andrii.lecture4.hometask4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr;
        String secondStr;

        // Task #1
        System.out.print("Enter string to check if it is a pallindrome: ");
        String palindrome = scanner.nextLine();
        if (isPalindrome(palindrome)) {
            System.out.println("Your string: \"" + palindrome + "\" is palindrome");
        } else {
            System.out.println("Your string: \"" + palindrome + "\" is not palindrome");
        }

        // Task #2
        System.out.print("String 1: ");
        firstStr = scanner.nextLine();

        System.out.print("String 2: ");
        secondStr = scanner.nextLine();

        System.out.println("The concatenated string: " + firstStr + " " + secondStr);

        // Task #3
        System.out.print("String 1: ");
        firstStr = scanner.nextLine();

        System.out.print("String 2: ");
        secondStr = scanner.nextLine();

        if (firstStr.equalsIgnoreCase(secondStr)) {
            System.out.println(firstStr + " is equal to " + secondStr);
        } else {
            System.out.println(firstStr + " is not equal to " + secondStr);
        }

        //Task #4
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        System.out.println("The given string: " + str);
        System.out.println(getWordSymbolsAtEvenPositions(str));

        // Task #5
        User petro = new User("Petro", 24);

        // Task #6
        Area area = Area.getArea();
        System.out.println(area.returnArea());

    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static String getWordSymbolsAtEvenPositions(String str) {
        String[] strArr;
        StringBuilder stringBuilder = new StringBuilder();

        strArr = str.split("\\b");  // Розбиваємо рядок на слова та розділові знаки
        for (String word : strArr) {
            if (word.matches("\\w+")) { // Знаходимо в рядку лише слова відкидаючи розділові знаки
                stringBuilder.append(word).append(" ");
            }
        }
        strArr = stringBuilder.toString().split("\\s");
        stringBuilder.delete(0, stringBuilder.length());
        for (String word : strArr) {
            for (int i = 0; i < word.length(); i += 2) { // В кожному слові рядка шукаємо лише символи, що мають парний індекс
                stringBuilder.append(word.charAt(i));
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
