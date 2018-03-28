package com.prowo.offer.producer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.err.println("consumer:" + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
