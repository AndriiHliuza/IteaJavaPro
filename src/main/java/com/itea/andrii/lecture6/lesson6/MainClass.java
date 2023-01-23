package com.itea.andrii.lecture6.lesson6;

public class MainClass {
    UkrainePrice ukrainePrice;
    EnglandPrice englandPrice;

    MainClass() {
        ukrainePrice = new UkrainePrice();
        englandPrice = new EnglandPrice();

        System.out.println("Ціна автомобіля в Україні складає " + ukrainePrice.countLocalCost());
        System.out.println("Ціна автомобіля в Україні складає " + englandPrice.countLocalCost());
    }


    public static void main(String[] args) {
        new MainClass();
    }
}
