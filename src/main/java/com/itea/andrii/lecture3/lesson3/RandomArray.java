package com.itea.andrii.lecture3.lesson3;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 5;
        int m = 4;
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }

        int[] array2 = {1, 4, 2, 8, 9};
        int sum = 0;
        for (int num : array2) {
            sum += num;
        }
        System.out.println("Sum = " + sum);

        Scanner scanner = new Scanner(System.in);
        int[] array3 = new int[10];

        int sum2 = 0;
        for (int i = 0; i < array3.length; i++) {
            System.out.print("Enter element #" + (i + 1) + ") ->  ");
            array3[i] = scanner.nextInt();
            sum2 += array3[i];
        }
        System.out.println("Sum = " + sum2);
    }
}
