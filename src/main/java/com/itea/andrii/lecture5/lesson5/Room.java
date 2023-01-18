package com.itea.andrii.lecture5.lesson5;

public class Room {
    private double width;
    private double height;
    private double length;

    public Room(final double width, double height, double length) {
        this.width = width;
//        width = 5;
        this.height = height;
        this.length = length;
    }

    public double calculateCapacity() {
        return width * length * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public static void main(String[] args) {
        Room room = new Room(6, 4, 2.7);
        System.out.println("Об'єм кімнати: " + room.calculateCapacity() + " м.куб");
    }
}
