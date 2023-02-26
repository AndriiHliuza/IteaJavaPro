package com.itea.andrii.lecture15.lesson15;

public class ExceptionThread extends Thread {
    @Override
    public void run() {
        boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }

        System.out.println("end of ExceptionThread");
    }
}
