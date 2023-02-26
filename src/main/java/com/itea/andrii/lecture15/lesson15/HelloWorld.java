package com.itea.andrii.lecture15.lesson15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HelloWorld {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main started");
        Callable<String> task = () -> {
            Thread.sleep(2000);
            System.out.println("hello");
            return "Hello World";
        };

        FutureTask<String> future = new FutureTask<>(task);

        new Thread(future).start();
        String s = future.get();
        System.out.println(s);
        System.out.println(future.get());

        Callable<String> task2 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("How are you?");
                return "Good day";
            }
        };

        FutureTask<String> futureTask = new FutureTask<>(task2);
        new Thread(futureTask).start();
        String s2 = futureTask.get();
        System.out.println(futureTask.get());
        System.out.println(s2);

        System.out.println("Main finished");
    }
}
