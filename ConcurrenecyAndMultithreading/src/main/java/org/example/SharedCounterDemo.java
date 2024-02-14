package org.example;

public class SharedCounterDemo {
    static int counter = 0;

     static synchronized void increment(){
        System.out.println("Before inc: " + counter);
        counter++;
        System.out.println("After inc: " + counter);
    }

    public static void main(String[] args) {
         for (int i = 0; i < 10; i++) {
             new Thread(SharedCounterDemo::increment).start();
         }
    }

}
