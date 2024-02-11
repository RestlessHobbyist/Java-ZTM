package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Some", "Sample", "Strings", "Here", "Consequential", "Serializable");
        List<String> longYellingWords = stringList.stream()
                .filter(s -> s.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Look at these capitalized long words: " + longYellingWords);
    }
}
