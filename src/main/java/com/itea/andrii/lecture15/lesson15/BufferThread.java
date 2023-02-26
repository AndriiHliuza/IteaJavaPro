package com.itea.andrii.lecture15.lesson15;

public class BufferThread {
    static int counter;
    static StringBuffer sB = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                synchronized (sB) {
                    while (counter++ < 3) {
                        sB.append("A");
                        System.out.print("1> " + counter + " ");
                        System.out.println(sB);
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            System.err.println(e);
                        }
                    }
                }
            }
        }.start();

        Thread.sleep(100);
        synchronized (sB) {
            while (counter++ < 6) {
                System.out.print("2> " + counter + " ");
                sB.append("B");
                System.out.println(sB);
            }
        }
    }
}
