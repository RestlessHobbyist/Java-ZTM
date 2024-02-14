package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService exServ = Executors.newFixedThreadPool(2);

        Runnable runner1 = () -> System.out.println("Hello from runner1 on Thread ID: " + Thread.currentThread().threadId());
        Runnable runner2 = () -> System.out.println("Hello from runner2 on Thread ID: " + Thread.currentThread().threadId());
        Runnable runner3 = () -> System.out.println("Hello from runner3 on Thread ID: " + Thread.currentThread().threadId());
        Runnable runner4 = () -> System.out.println("Hello from runner4 on Thread ID: " + Thread.currentThread().threadId());
        Runnable runner5 = () -> System.out.println("Hello from runner5 on Thread ID: " + Thread.currentThread().threadId());

        exServ.submit(runner1);
        exServ.submit(runner2);
        exServ.submit(runner3);
        exServ.submit(runner4);
        exServ.submit(runner5);

//        ...or the smart way...
        for (int i = 0; i < 5; i++){
            exServ.submit(() -> {
                System.out.println("Thread ID: " + Thread.currentThread().threadId());
            });
        }

        exServ.shutdown();
    }
}
