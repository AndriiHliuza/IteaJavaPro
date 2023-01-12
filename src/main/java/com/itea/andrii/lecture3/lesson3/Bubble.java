package com.itea.andrii.lecture3.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 2, 6, 4, 3, 9, 5};

        System.out.println("----Before sorting----");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        int x;
        int r = 56;
        System.out.println("hello");
        int z = 9;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }

        System.out.println("\n----After sorting----");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        int[] numbers = {2, 5, 8, 2, 6, 4, 3, 9, 5};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));

        float[] firstArray  = new float[5];
        float[] secondArray = new float[5];

        firstArray[0] = 0.0f;
        firstArray[1] = 1.0f;
        firstArray[2] = 2.0f;
        firstArray[3] = 3f;
        firstArray[4] = 4.0f;

        secondArray = firstArray.clone();
        firstArray[2] = 3.8f;

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        int userNumber = getNumber();
        System.out.println(userNumber);
    }


    public static int getNumber() {
        int number;
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Not valid number: " + scanner.next());
            number = getNumber();
        }
        return number;
    }
}
