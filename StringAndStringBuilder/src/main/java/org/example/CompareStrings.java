package org.example;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "dog";
        String str2 = "cat";

        System.out.println("Does dog == cat? " + str1.equals(str2));

        str2 = "dog";

        System.out.println("Does dog == dog? " + str1.equals(str2));
    }
}
