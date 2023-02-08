package com.itea.andrii.lecture10.lesson10;

public class ShapeRunner {
    public static void main(String[] args) {
        double x = 2, y = 3;
        getInfo(Shape.RECTANGLE, x, y);
        getInfo(Shape.TRIANGLE, x, y);
        getInfo(Shape.CIRCLE, x);
    }

    private static void getInfo(Shape sh, double ...x) {
        System.out.printf("%-10s = %-5.2f \n", sh, sh.defineSquare(x));
    }
}
