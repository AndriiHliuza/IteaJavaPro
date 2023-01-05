package com.itea.andrii.lecture2.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        boolean a = true;
//        int counter = 0;
//
//        while (a) {
//            System.out.println("In loop " + counter);
//            counter++;
//            if (counter > 5) {
//                a = false;
//            }
//        }

//        Random random = new Random();
//        int randInt = random.nextInt(10);
//        System.out.println(randInt);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.hasNextInt());
//        System.out.println(scanner.nextInt());
//
//        String a = "Y";
//        String b = "N";
//
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b));

//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        String answer;
//        int number;
//        int randomNumber;
//
//        do {
//            System.out.println("-----------Вгадайте число від 1 до 10--------------");
//            System.out.print("Введіть число: ");
//            if (scanner.hasNextInt()) {
//                number = scanner.nextInt();
//                randomNumber = random.nextInt(1, 11);
//                if (number == randomNumber) {
//                    System.out.println("Ти вгадав число");
//                    break;
//                } else {
//                    System.out.println("Ти помилився. Random number = " + randomNumber);
//                }
//            } else {
//                scanner.next();
//                System.out.println("Невірно введені дані");
//            }
//            System.out.print("Бажаєте спробувати ще раз? ((Y or y) for Yes, (N or n) for No) -> ");
//            answer = scanner.next();
//        } while (answer.equalsIgnoreCase("Y"));


//        int[] array = {1, 5, 6, 1, 3};
//
//        int size = array.length;
//        System.out.println("Елементи масиву");
//        for (int i = 0; i < size; i++) {
//            System.out.println("a[" + i + "] = " + array[i]);
//        }


//        for (int a = 0; a <= 10; a++) {
//            if (a == 6) {
//                System.out.println("in break");
//                break;
//            }
//            System.out.println(a);
//        }

//        Scanner in = new Scanner(System.in);
//        int n = 1;
//
//        read_data:
//        while (n < 10) {
//            for (int a = 1; a < 3; a++) {
//                System.out.print("Enter a number >= 0: ");
//                n = in.nextInt();
//
//                if (n < 0) {
//                    break read_data;
//                }
//            }
//        }
//
//        if (n < 10) {
//            System.out.println("after break");
//        } else {
//            System.out.println("after break in else");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//
//        while (sum < 100) {
//            System.out.println("Enter number: ");
//
//            int n = scanner.nextInt();
//
//            if (n < 0) {
//                System.out.println("continue");
//                continue;
//            }
//
//            sum += n;
//            System.out.println(sum);
//        }


        int value = 4;
        switch (value) {
            case 0:
                System.out.println("case 0");
                break;
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 4");
                break;
            default:
                System.out.println("default");
                break;
        }

        switch (value) {
            case 0, 5, 7 -> System.out.println("case 0");
            case 1 -> System.out.println("case 1");
            case 2 -> System.out.println("case 2");
            case 3 -> System.out.println("case 3");
            case 4 -> System.out.println("case 4");
            default -> System.out.println("default");
        }

        int result = switch (value) {
            case 0, 5, 7 -> 101;
            case 1 -> 102;
            case 2 -> 103;
            case 3 -> 104;
            case 4 -> 105;
            default -> 0;
        };
    }
}
