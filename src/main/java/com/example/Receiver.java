package com.example;

/**
 * Created by Brian Casteel on 2/11/2016.
 */

import java.util.concurrent.CountDownLatch;

public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
