package com.itea.andrii.lecture7.lesson7;

public class CarRunner {
    public static void main(String[] args) {
        Car2[] cars = new Car2[5];

        Car2 car1 = new Car2();
        car1.maker = "Audi";
        car1.price = 10000;
        car1.year = "2000";
        car1.color = "red";

        Car2 car2 = new Car2("BMW", 12000, "2001", "black");


        cars[0] = car1;
        cars[1] = car2;
//        System.out.println(car1);
//        System.out.println(car2);

        for (int i = 0; i < Car2.getCount(); i++) {
            System.out.println(cars[i]);
        }
    }
}
