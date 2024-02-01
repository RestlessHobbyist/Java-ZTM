package org.example;

public class TicketPrice {
    public static void main(String[] args) {
        int age = (int) (Math.random() * 25);
        double ticketPrice;

        if(age < 5){
            ticketPrice = 0;
        }else if(age < 12){
            ticketPrice = 5;
        }else if(age < 18){
            ticketPrice = 10;
        }else{
            ticketPrice = 15;
        }
        System.out.println("For someone "+ age +" years old, the ticket price is $" + ticketPrice);
    }
}
