package org.example;

public class StringMethods {
    public static void main(String[] args) {
        String greeting = "Hello, World!";

        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.substring(7,12));
        System.out.println(greeting.replace("World","Java"));
    }
}
