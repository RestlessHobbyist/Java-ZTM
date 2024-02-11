package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> listOfNbrs = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> squaredEvens = listOfNbrs.stream()
                .filter(i -> i % 2 != 0)
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(squaredEvens);
    }
}
