package com.itea.andrii.lecture5.lesson5;

public class Room2 extends Room {
    public Room2(double width, double height, double length) {
        super(width, height, length);
    }

    @Override
    public double calculateCapacity() {
        return super.calculateCapacity() * 1000;
    }


    public double calculateSquare() {
        return getWidth() * getLength();
    }

    @Override
    public String toString() {
        return "Об'єм кімнати = " + calculateCapacity() + "\nПлоща кімнати = " + calculateSquare();
    }
}
