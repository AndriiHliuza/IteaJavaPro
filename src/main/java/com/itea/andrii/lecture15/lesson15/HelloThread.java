package com.itea.andrii.lecture15.lesson15;

public class HelloThread {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hello Thread");
        };

        new Thread(task).start();

        Runnable newTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello one more time");
            }
        };

        new Thread(newTask).start();
    }
}
