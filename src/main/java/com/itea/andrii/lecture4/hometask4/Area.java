package com.itea.andrii.lecture4.hometask4;

import java.util.Scanner;

public class Area {
    private double length;
    private double width;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double returnArea() {
        return length * width;
    }

    public static Area getArea() {
        Scanner scanner = new Scanner(System.in);
        double width;
        double length;
        while (true) {
            System.out.print("Enter width: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid value");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.print("Enter length: ");
            if (scanner.hasNextDouble()) {
                length = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid value");
                scanner.nextLine();
            }
        }
        return new Area(length, width);
    }
}
