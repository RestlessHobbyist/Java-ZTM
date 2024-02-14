package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread ID: " + Thread.currentThread().threadId());
        MyThread myThread = new MyThread();
//        now we need to start the thread with start(), not run(), which would just call the method not start a new thread. Proof below
        myThread.run();
//        notice the thread ID difference ^ and below
        myThread.start();
//        But this^ restricts you from extending any other classes due to Java's single inheritance limitation so...

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
//        Again you need start() not run(), but here's some more proof
        thread.run();
//        for comparison: if the thread IDs you see at the end are the same, no new thread was started
        thread.start();

//        but of course we have lambda superpowers, sooo...

        Runnable myRunnable2 = () -> System.out.println("Another runnable!??! WOW! Oh, here's my thread ID: " + Thread.currentThread().threadId());
        Thread anotherThread = new Thread(myRunnable2);
        anotherThread.run();
        anotherThread.start();
    }
}