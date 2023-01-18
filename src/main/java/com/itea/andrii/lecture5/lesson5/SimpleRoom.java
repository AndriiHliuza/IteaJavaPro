package com.itea.andrii.lecture5.lesson5;

public class SimpleRoom {
    protected double width;
    protected double length;

    public SimpleRoom(double width, double length) {
        this.width = width;
        this.length = length;
        System.out.println("SimpleRoom створено");
    }

    public void info() {
        System.out.println("Кімната: ширина = " + width + ", довжина = " + length);
        System.out.println("Площа кімнати: " + width * length);
    }

    public static void main(String[] args) {
        SimpleRoom simpleRoom = new SimpleRoom(5, 6);
        simpleRoom.info();
    }
}
