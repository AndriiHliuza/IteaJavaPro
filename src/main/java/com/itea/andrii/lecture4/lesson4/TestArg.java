package com.itea.andrii.lecture4.lesson4;

public class TestArg {
    static double k[] = {5.1, 5.2, 5.3, 5.4, 5.5};

    public static double sum(double... nums) {
        double sum = 0;

        System.out.println("Кількість аргументів = " + nums.length);
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сума = " + sum(k));
        System.out.println("Сума = " + sum(33.4, 2.0));
        System.out.println("Сума = " + sum(5.0));
    }
}
