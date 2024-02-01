package org.example;

public class Main {
    public static void main(String[] args) {
        Person candidate = new Person();
        System.out.println("Candidate's name: " + candidate.name);
        System.out.println("Candidate's age: " + candidate.age);
        System.out.println("Candidate's address: " + candidate.address);
        System.out.println("Candidate's ssn: unobtainium - 'tis private" );

        System.out.println("The counter is at: " + Counter.count);
        Counter.increment();
        System.out.println("After incrementing, it's at: " + Counter.count);
    }
}