package org.example;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("Print", "each", "of", "us", "out");

        //Using a 'for' loop
        for(String s : stringsList){
            System.out.println(s);
        }
        //Using 'forEach'  and lambda
        stringsList.forEach(s -> System.out.println(s));
    }
}
