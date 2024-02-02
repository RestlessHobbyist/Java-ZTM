package org.example;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setContent(8);

        Box<String> strBox = new Box<>();
        strBox.setContent("Box String");
    }
}