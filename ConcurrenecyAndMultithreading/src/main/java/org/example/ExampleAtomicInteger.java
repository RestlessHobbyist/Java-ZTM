package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class ExampleAtomicInteger {
    static int counter = 0;
    static AtomicInteger aCounter = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++){
                counter++;
                aCounter.getAndIncrement();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++){
                counter++;
                aCounter.getAndIncrement();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Regular Counter reached: " + counter);
        System.out.println("Atomic Counter reached: " + aCounter);
    }
}
