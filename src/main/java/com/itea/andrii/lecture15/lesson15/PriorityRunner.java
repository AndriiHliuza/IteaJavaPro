package com.itea.andrii.lecture15.lesson15;

public class PriorityRunner {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Група потоків 1");
        threadGroup.setMaxPriority(Thread.MIN_PRIORITY);

        PriorThread min = new PriorThread(threadGroup,"Min");
        PriorThread max = new PriorThread("Max");
        PriorThread norm = new PriorThread(threadGroup,"Norm");

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        System.out.println(norm.getPriority());

        min.start();
        max.start();
        norm.start();

        System.out.println(norm.getPriority());

    }
}
