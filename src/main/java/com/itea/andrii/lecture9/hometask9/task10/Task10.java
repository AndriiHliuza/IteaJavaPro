package com.itea.andrii.lecture9.hometask9.task10;

public class Task10 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.addModel("Samsung", 2022, 100, 6);
        mobile.addModel("IPhone", 2023, 200, 8);

        mobile.showAllModels();
    }
}
