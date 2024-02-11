package org.example;

import java.util.Arrays;
import java.util.List;

public class SuOfSquareExample {
    public static void main(String[] args) {
        List<Integer> nbrsList = Arrays.asList(1,2,3,4,5,6,7,8);
        int squaredSum = nbrsList.stream()
                .map(i -> i*i)
                .reduce(0, Integer::sum);
        System.out.println("Summed squares: " + squaredSum);
    }
}
