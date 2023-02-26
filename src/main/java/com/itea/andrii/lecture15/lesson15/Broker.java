package com.itea.andrii.lecture15.lesson15;

public class Broker extends Thread {
    private Market market;
    private static final int PAUSE = 500;
    private int count;

    public Broker(Market market, int count) {
        this.market = market;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Broker #" + count + "Current index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
