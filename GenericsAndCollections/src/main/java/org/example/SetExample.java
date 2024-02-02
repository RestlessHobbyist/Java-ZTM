package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> listOnumbers = new HashSet<>();
        listOnumbers.add(3);
        listOnumbers.add(8);
        listOnumbers.add(11);
        //PoC that Sets cannot contain duplicates
        listOnumbers.add(8);
        System.out.println(listOnumbers);
    }
}
