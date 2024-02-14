package org.example;

public class BasicThreadCreation {
    public static void main(String[] args) {
        Thread newThread = new Thread(() -> {
            System.out.println("Hello from new Thread. ID: " + Thread.currentThread().threadId());
        });
        newThread.start();
    }
}
