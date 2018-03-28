package com.prowo.offer.producer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerComsumerTest {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>(2);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
