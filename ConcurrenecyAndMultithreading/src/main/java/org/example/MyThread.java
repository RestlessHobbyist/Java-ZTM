package org.example;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from MyThread, extending Thread with ID: " + Thread.currentThread().threadId());
    }
}
