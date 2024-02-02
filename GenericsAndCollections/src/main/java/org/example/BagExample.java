package org.example;

public class BagExample {
    public static void main(String[] args) {
        Bag<String> stringBag = new Bag<>();
        stringBag.addItem("Oranges");
        stringBag.addItem("Peaches");
        stringBag.addItem("Pineapples");

        Bag<Integer> intBag = new Bag<>();
        intBag.addItem(3);
        intBag.addItem(8);
        intBag.addItem(11);
    }
}
