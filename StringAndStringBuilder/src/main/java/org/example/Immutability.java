package org.example;

public class Immutability {
    public static void main(String[] args) {
        String str = "value";
        String upperCaseStr = str.toUpperCase();
        System.out.println(str);
        System.out.println(upperCaseStr);
    }
}
