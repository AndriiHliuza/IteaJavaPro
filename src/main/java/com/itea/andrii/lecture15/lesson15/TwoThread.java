package com.itea.andrii.lecture15.lesson15;

public class TwoThread {
    public static int counter = 0;

    public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder();
        new Thread() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                /*synchronized (stringBuilder)*/ {
                    do {
                        stringBuilder.append("A");
                        System.out.println("1: " + stringBuilder);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            System.err.println(e);
                        }
                    } while (TwoThread.counter++ < 2);
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                synchronized (stringBuilder) {
                    while (TwoThread.counter++ < 6) {
                        stringBuilder.append("B");
                        System.out.println("2: " + stringBuilder);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }.start();

//        new Thread() {
//            @Override
//            public void run() {
////                try {
////                    Thread.sleep(1000);
////                } catch (InterruptedException e) {
////                    throw new RuntimeException(e);
////                }
//                synchronized (stringBuilder) {
//                    while (TwoThread.counter++ < 9) {
//                        stringBuilder.append("C");
//                        System.out.println("3: " + stringBuilder);
//                        try {
//                            Thread.sleep(50);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//            }
//        }.start();
    }
}
