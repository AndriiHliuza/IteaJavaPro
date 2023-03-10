package com.itea.andrii.lecture2.hometask2;

import java.util.Scanner;

public class MainRenamed {
    public static void main(String[] args) {
        // Task1
        System.out.println("Task1");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Task2
        System.out.println("Task2");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Task3
        System.out.println("Task3");
        for (int i = 1; i < 11; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));
        }

        System.out.println("\n");

        // Task4
        System.out.println("Task4");
        Scanner scanner = new Scanner(System.in);

        int userNumber;
        String userAnswer;
        int sum;

        do {
            sum = 0;
            System.out.print("Input a number: ");
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                for (int i = 1; i <= userNumber; i++) {
                    sum += i;
                }
                System.out.println("Сума = " + sum);
                userAnswer = "N";
            } else {
                System.out.println("Not a number");
                System.out.print("Want to try again? (Y for Yes | N for No): ");
                scanner.next();
                userAnswer = scanner.next();
            }
        } while (userAnswer.equalsIgnoreCase("Y"));

        System.out.println("\n");

        // Task5
        System.out.println("Task5");
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n");


        // Task6
        System.out.println("Task6");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Task7
        System.out.println("Task7");

        String userAnswer2;
        int numberOfAttempts = 0;

        do {
            System.out.println("Що то є таке: синє велике з вусами та повне зайців?");
            System.out.print("Введіть Вашу відповідь: ");
            userAnswer2 = scanner.next();
            System.out.println();

            switch (userAnswer2.toLowerCase()) {
                case "тролейбус" -> System.out.println("Правильно");
                case "здаюсь" -> System.out.println("Правильна відповідь: тролейбус");
                default -> {
                    System.out.println("На жаль відповідь не правильна");
                    if (++numberOfAttempts != 3) {
                        System.out.println("Подумайте ще\n");
                    } else {
                        System.out.println("Максимальна кількість спроб вичерпана\n");
                    }
                }
            }
        } while (!(userAnswer2.equalsIgnoreCase("здаюсь")
                || userAnswer2.equalsIgnoreCase("тролейбус")
                || (numberOfAttempts == 3)));
        scanner.close();
    }
}
