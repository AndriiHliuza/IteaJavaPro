package com.itea.andrii.lecture5.lesson5;

public class Application {
    private Room2 room2;

    Application() {
        room2 = new Room2(5.1, 5.2, 5.2);
//        System.out.println("Об'єм кімнати = " + room2.calculateCapacity() + " дм.куб");
        System.out.println(room2);
    }

    public static void main(String[] args) {
        new Application();
    }
}
