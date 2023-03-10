package com.itea.andrii.lecture16.lesson16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ChannelPool<T> {
    private final static int POOL_SIZE = 5;
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private final Queue<T> resources = new LinkedList<>();

    public ChannelPool(Queue<T> source) {
        resources.addAll(source);
    }


    public T getResource(long maxWaitMillis) throws ResourceException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                T res = resources.poll();
//                System.out.println(res);
                return res;
            }
        } catch (InterruptedException e) {
            throw new ResourceException(e);
        }
        throw new ResourceException("Перевищено час очікування");
    }

    public void returnResource(T res) {
        resources.add(res);
        semaphore.release();
    }
}
