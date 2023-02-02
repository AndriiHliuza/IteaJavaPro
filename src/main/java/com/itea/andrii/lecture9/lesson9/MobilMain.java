package com.itea.andrii.lecture9.lesson9;

public class MobilMain {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Bob");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(380, 67);

        System.out.println(abonent);
    }
}
