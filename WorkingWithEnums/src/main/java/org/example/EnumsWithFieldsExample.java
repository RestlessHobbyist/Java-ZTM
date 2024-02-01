package org.example;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {
        for(Planet planet: Planet.values()){
            System.out.println(planet.getName()+" is "+planet.getAuFromSun()+"AU from the Sun.");
        }
    }
}
