package com.itea.andrii.lecture5.lesson5;

public class SimpleRoom2 extends SimpleRoom {
    protected double height;
    public SimpleRoom2(double width, double length, double height) {
        super(width, length);
        this.height = height;
        System.out.println("SimpleRoom2 створено");
    }

    public void info2() {
        System.out.println("Кімната: ширина = " + width + ", довжина = " + length);
        System.out.println("Площа кімнати: " + width * length);
        System.out.println("Об'єм кімнати: " + width * length * height);
    }

    public static void main(String[] args) {
        final var simpleRoom2 = new SimpleRoom2(5, 6, 3);
        final var simpleRoom22 = new SimpleRoom2(5, 6, 3);
        System.out.println("Метод info SimpleRoom");
        simpleRoom2.info();
//        simpleRoom2 = simpleRoom22;
        System.out.println("Метод info2 SimpleRoom2");
        simpleRoom2.info2();

//        var b;
        var test = 0.0;
        if (simpleRoom2.height > 4) {
            test = 7.0;
        } else {
            test = 6.0;
        }
    }

    public Integer getInt(final int height) {
        final var varTest = "";
//        Integer test = null;
        var test = Integer.valueOf(5);
        if (height > 6) {
            test = 7;
        } else {
            test = null;
        }

        return test;
    }
}
