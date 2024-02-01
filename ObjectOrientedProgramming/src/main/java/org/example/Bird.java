package org.example;

public class Bird extends Animal{
    public Bird(){
        super("chirp");
    }

    @Override
    public void makeSound(){
        System.out.println("Birds go: " +getSound());
    }
}
