package org.example;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime event = LocalDateTime.of(2023,11,21,18,0);
        System.out.println("Event time: " + event);
    }
}
