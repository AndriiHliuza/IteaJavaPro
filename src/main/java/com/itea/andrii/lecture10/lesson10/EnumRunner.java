package com.itea.andrii.lecture10.lesson10;

public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        for (Shape2 f : Shape2.values()) {
            f.setShape(3, i--);
            System.out.println(f + " площа = " + f.computeSquare());
        }
    }
}
