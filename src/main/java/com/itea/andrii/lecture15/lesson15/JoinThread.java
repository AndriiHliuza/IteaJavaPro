package com.itea.andrii.lecture15.lesson15;

public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String nameT = getName();
        System.out.println("Старт потоку " + nameT);
        try {
            long timeout = switch (nameT) {
                case "First" -> 5_000;
                case "Second" -> 1_000;
                default -> 0;
            };
            Thread.sleep(timeout);
            System.out.println("Завершення потоку " + nameT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
