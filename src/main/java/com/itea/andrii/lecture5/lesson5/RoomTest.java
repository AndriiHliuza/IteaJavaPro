package com.itea.andrii.lecture5.lesson5;

public class RoomTest extends SimpleRoom {
    public RoomTest(double width, double length) {
        super(width, length);
    }

    public static void main(String[] args) {
        RoomTest roomTest = new RoomTest(23, 50);
        System.out.println(roomTest.width);
    }
}
