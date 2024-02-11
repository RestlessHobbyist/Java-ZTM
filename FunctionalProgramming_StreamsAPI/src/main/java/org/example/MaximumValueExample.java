package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumValueExample {
    public static void main(String[] args) {
        List<Integer> intsList = Arrays.asList(2,3,5,7,9,12,543,26,68,36,78,34,62,267);
        Optional<Integer> largestInt = intsList.stream()
                .max(Comparator.naturalOrder());

        //^This works...but the solutions presents an alt approach:
        Optional<Integer> max = intsList.stream()
                .max(Integer::compare);

        System.out.println("The fist approach yields: " + largestInt);
        System.out.println("The second approach yields: " + max.get());
    //The 'get()' above removes the "[Optional]" from the printed result
        max.ifPresent(value -> System.out.println("Max value from second print approach: " + value));
    //As does this ^ approach to printing the value of 'max' since we're checking if it exists. I don't fully understand this Optional interaction just yet
    }
}
