package com.itea.andrii.lecture16.lesson16;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionDemo {
//    public static int value = 0;
    public static AtomicInteger value = new AtomicInteger(0);

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                int oldValue = value.get();
                int newValue = value.incrementAndGet();
//                int oldValue = value;
//                int newValue = ++value;

                if (oldValue + 1 != newValue) {
                    throw new IllegalStateException(oldValue + " + 1 = " + newValue);
                }
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}
