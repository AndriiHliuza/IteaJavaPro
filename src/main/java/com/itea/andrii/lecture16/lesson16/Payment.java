package com.itea.andrii.lecture16.lesson16;

import java.util.Scanner;

public class Payment {
    private int amount;
    private boolean close;

    public int getAmount() {
        return amount;
    }

    public boolean isClose() {
        return close;
    }

    public synchronized void doPayment() {
        try {
            System.out.println("Start payment:");
            while (amount <= 0) {
                this.wait();
            }
            close = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment is closed: " + close);
    }

    public void initAmount() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            amount = scanner.nextInt();
        } else {
            initAmount();
        }
    }
}
