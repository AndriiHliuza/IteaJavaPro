package com.itea.andrii.lecture15.lesson15;

public class PriorThread extends Thread {
    public PriorThread(String name) {
        super(name);
    }

    public PriorThread(ThreadGroup group, String name) {
        super(group, name);
    }



    @Override
    public void run() {
        for (int i = 0; i < 71; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
