package com.itea.andrii.lecture16.lesson16;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Bid extends Thread {
    private Integer bidId;
    private int price;
    private CyclicBarrier barrier;

    public Bid(Integer bidId, int price, CyclicBarrier barrier) {
        this.bidId = bidId;
        this.price = price;
        this.barrier = barrier;
    }

    public Integer getBidId() {
        return bidId;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            System.out.println("Client " + bidId + " specifies a price");
            Thread.sleep(random.nextInt(3000));

            int delta = random.nextInt(50);
            price += delta;

            System.out.println("Bid " + bidId + ":" + price);
            Thread.sleep(5000);
            System.out.println("Bidddd " + bidId);
            barrier.await();
            System.out.println("ddddd " + bidId);
            //Thread.sleep(5000);
            System.out.println("continue to work..." + bidId);
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
