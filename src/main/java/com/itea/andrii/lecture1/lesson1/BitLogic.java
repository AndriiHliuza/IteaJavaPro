package com.itea.andrii.lecture1.lesson1;

public class BitLogic {
    public static void main(String[] args) {
        String[] binary = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        int a = 3;
        int b = 6;

        int c = a | b;

        System.out.println("    a = " + binary[a]);
        System.out.println("    a = " + binary[b]);
        System.out.println("    a = " + binary[c]);
    }
}
