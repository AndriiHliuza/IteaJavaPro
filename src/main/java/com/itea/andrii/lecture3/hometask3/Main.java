package com.itea.andrii.lecture3.hometask3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        Task #1
            1.Створіть масив з 8-ми випадкових цілих чисел з відрізка [1; 10]
            2.Виведіть масив на екран у результаті
            3.Замініть кожен елемент з непарним індексом на нуль
            4.Знову виведіть масив на екран
         */
        System.out.println("----Task #1----");
        int[] arr = getArrayWithRandomNumbers(8, 1, 11);
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));


        /*
        Task #2
            Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15].
            Визначте який елемент є в цьому масиві максимальним і
            повідомте індекс його останнього входження в масив.
         */
        System.out.println("\n----Task #2----");
        int[] arr2 = getArrayWithRandomNumbers(12, -15, 16);
        System.out.println(Arrays.toString(arr2));
        int maxElementIndex = getLastMaxElementIndex(arr2);
        System.out.println("Максимальний елемент в масиві " + arr2[maxElementIndex] + " має індекс " + maxElementIndex);


        /*
        Task #3
            1. Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99]
            2. Виведіть його на екран у рядок.
            3. Далі визначте і виведіть на екран повідомлення про те, чи є масив строго зростаючої послідовністю.
         */
        System.out.println("\n----Task #3----");
        int[] arr3 = getArrayWithRandomNumbers(4, 10, 100);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Масив строго зростаюча послідрвність: " + isArrayStrictlyGrowingSequence(arr3));

        /*
        Task #4
            Напишіть програму, яка міняє місцями елементи одновимірного масиву з
            String в зворотному порядку.
            Не використовуйте додатковий масив для зберігання результатів.
         */
        System.out.println("\n----Task #4----");
        String[] arr4 = {
                "Andrii",
                "Kostya",
                "Ruslan",
                "Roman",
                "John"
        };
        System.out.println(Arrays.toString(arr4));
        swapElementsInArray(arr4);
        System.out.println(Arrays.toString(arr4));

        /*
        Task #5
            1. Створіть 2 масива з 5 випадкових цілих чисел з відрізка [0; 5] кожен
            2. Виведіть масиви на екран в двох окремих рядках
            3. Порахуйте середнє арифметичне елементів кожного масиву і повідомте, для
            якого з масивів це значення виявилося
            більше (або повідомте, що їх середнє арифметичне рівні)
         */
        System.out.println("\n----Task #5----");
        int[] firstArr = getArrayWithRandomNumbers(5, 0, 6);
        int[] secondArr = getArrayWithRandomNumbers(5, 0, 6);

        System.out.println("Array #1 -> " + Arrays.toString(firstArr));
        System.out.println("Array #2 -> " + Arrays.toString(secondArr));

        compareAverageNumbersOfArrays(firstArr, secondArr);
    }

    public static int[] getArrayWithRandomNumbers(int arrayLength, int leftBorder, int rightBorder) {
        Random random = new Random();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = random.nextInt(leftBorder, rightBorder);
        }
        return arr;
    }

    public static int getLastMaxElementIndex(int[] arr) {
        int maxElementIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[maxElementIndex] <= arr[i]) {
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

    public static boolean isArrayStrictlyGrowingSequence(int[] arr) {
        boolean isStrictlyGrowing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isStrictlyGrowing = false;
                break;
            }
        }
        return isStrictlyGrowing;
    }

    public static void swapElementsInArray(String[] arr) {
        String temp;
        for (int i = 0; i < (arr.length / 2); i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void compareAverageNumbersOfArrays(int[] firstArr, int[] secondArr) {
        double firstArrayAverageNumber = Arrays.stream(firstArr).average().orElseThrow();
        double secondArrayAverageNumber = Arrays.stream(secondArr).average().orElseThrow();
        System.out.println("Arr #1 (average number) -> " + firstArrayAverageNumber);
        System.out.println("Arr #2 (average number) -> " + secondArrayAverageNumber);
        if (firstArrayAverageNumber > secondArrayAverageNumber) {
            System.out.println("First is bigger");
        } else if (firstArrayAverageNumber < secondArrayAverageNumber) {
            System.out.println("Second is bigger");
        } else {
            System.out.println("Numbers are equal");
        }
    }

}
