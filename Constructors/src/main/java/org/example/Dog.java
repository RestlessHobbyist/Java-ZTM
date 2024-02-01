package org.example;

public class Dog extends Animal {
    private String breed;

    public Dog(String species, String breed, int age){
        super(species, age);
        this.breed = breed;
    }
    public Dog(){
        this("NoName","NoBreed",99);
    }
}
