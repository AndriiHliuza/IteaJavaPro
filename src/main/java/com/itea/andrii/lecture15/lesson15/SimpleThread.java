package com.itea.andrii.lecture15.lesson15;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("старт потоку-демона");
                Thread.sleep(10_000);
            } else {
                System.out.println("старт звичайного потоку");
                Thread.sleep(5_000);
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("Заверешння звичайного потоку");
            } else {
                System.out.println("Завершення потоку-демона");
            }
        }
    }
}
