package com.itea.andrii.lecture15.lesson15;

public class YieldRunner {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("Старт потоку 1");
                Thread.yield();
                System.out.println("Завершення потоку 1");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("Старт потоку 2");
                System.out.println("Завершення потоку2");
            }
        }.start();
    }
}
