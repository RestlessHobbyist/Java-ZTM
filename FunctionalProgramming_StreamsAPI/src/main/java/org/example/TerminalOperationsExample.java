package org.example;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        List<Integer> listOfNbrs = Arrays.asList(1,2,3,4,5,6,7,8,9);
        long nbrOfEven = listOfNbrs.stream()
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println("Number of evens found: " + nbrOfEven);
    }
}
