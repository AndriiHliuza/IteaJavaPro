package com.itea.andrii.lecture3.lesson3;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 8, 9};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum = " + sum);

        Scanner scanner = new Scanner(System.in);
        int[] array2 = new int[10];

        sum = 0;
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element #" + (i + 1) + ") ->  ");
            array2[i] = scanner.nextInt();
            sum += array2[i];
        }
        System.out.println("Sum = " + sum);
    }
}
