package com.itea.andrii.lecture15.lesson15;

public class DaemonRunner {
    public static void main(String[] args) {
        SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();

        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("Останній оператор main");
    }
}
