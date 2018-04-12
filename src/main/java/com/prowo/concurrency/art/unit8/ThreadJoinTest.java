package com.prowo.concurrency.art.unit8;

public class ThreadJoinTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("thread1");
            }
        });
    }

}
