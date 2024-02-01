package org.example;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder strBldr1 = new StringBuilder("ChapStick");
        StringBuilder strBldr2 = new StringBuilder("ChapStick");

        System.out.println("Are they equal? " + strBldr1.toString().equals(strBldr2.toString()));
        System.out.println("Concatenated: " + strBldr1.append(strBldr2));
        System.out.println("Reversed: " + strBldr1.reverse());
    }
}
