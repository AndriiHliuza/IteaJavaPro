package com.itea.andrii.lecture3.lesson3;

import java.util.Random;

public class ArrayMax {
    public static void main(String[] args) {
        double[] array = {1.1, 2.2, 1.1, 3.2, 1.2, 2.1};
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальне число в масиві: " + max);

//        int[][] twoD = new int[4][5];
//        int[][][] threeD = new int[5][5][5];

//        int[][] twoD = new int[5][];

//        twoD[0] = new int[5];
//        twoD[1] = new int[4];
//        twoD[2] = new int[3];
//        twoD[3] = new int[2];
//        twoD[4] = new int[1];

        int[][] twoD = {
                {5, 8, 9},
                {6, 9, 0},
                {1, 9}
        };

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.printf("%4d", twoD[i][j]);
            }
            System.out.println();
        }
    }
}
