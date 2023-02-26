package com.itea.andrii.lecture15.lesson15;

public class ExceptionThreadDemo {
    public static void main(String[] args) {
        new ExceptionThread().start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end of main");
    }
}
