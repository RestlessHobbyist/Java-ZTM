package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> someWords = Arrays.asList("These","Words","Should","Be","Capitalized");
        List<String> toUpUp = someWords.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(toUpUp);
    }
}
