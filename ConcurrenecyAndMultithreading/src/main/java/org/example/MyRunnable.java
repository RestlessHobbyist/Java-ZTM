package org.example;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from runnable implementation. Thread: " + Thread.currentThread().threadId());
    }
}
