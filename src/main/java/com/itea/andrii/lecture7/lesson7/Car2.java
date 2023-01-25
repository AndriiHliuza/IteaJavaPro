package com.itea.andrii.lecture7.lesson7;

public class Car2 {
    private static int count;
    private int id;
    public String maker;
    public double price;
    public String year;
    public String color;

    public Car2() {
        count++;
        id = count;
    }

    public Car2(String maker, double price, String year, String color) {
        this.maker = maker;
        this.price = price;
        this.year = year;
        this.color = color;
        count++;
        id = count;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "id=" + id +
                ", maker='" + maker + '\'' +
                ", price=" + price +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
