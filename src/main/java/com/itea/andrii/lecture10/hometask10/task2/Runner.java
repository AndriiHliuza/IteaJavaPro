package com.itea.andrii.lecture10.hometask10.task2;

public class Runner {
    public static void run(Running running) {
        if (running != null) {
            Class<? extends Running> runningClass = running.getClass();
            if (runningClass.isAnnotationPresent(Repeat.class)) {
                Repeat repeat = runningClass.getAnnotation(Repeat.class);
                for (int i = 0; i < repeat.value(); i++) {
                    System.out.println(repeat.phrase());
                }
            } else {
                System.err.println("There is no annotation for " + running);
            }
        } else {
            System.err.println("'running' is null");
        }


    }

    public static void main(String[] args) {
        run(new MyRunnable());
    }
}
