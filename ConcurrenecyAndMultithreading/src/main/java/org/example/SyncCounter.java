package org.example;

public class SyncCounter {
    static int counter = 0;

    static void badIncrementer() {
        int current = counter;
        System.out.println("B4 increment: " + counter + ". Thread ID: " + Thread.currentThread().threadId());
        counter = current + 1;
        System.out.println("After increment: " + counter);
    }

    static synchronized void betterIncrementer() {
        int current = counter;
        System.out.println("B4 increment: " + counter + ". Thread ID: " + Thread.currentThread().threadId());
        counter = current + 1;
        System.out.println("After increment: " + counter);


    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new Thread(SyncCounter::betterIncrementer).start();
        }

    }
}
