package org.example;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("*Lion King noises*");
        Bird b1 = new Bird();
        Parrot p1 = new Parrot();

        System.out.println("This should be 'Animals go: *Lion King noises*':");
        a1.makeSound();

        System.out.println("This should be 'Birds go: chirp':");
        b1.makeSound();

        System.out.println("This should be 'Birds go: squawk':");
        p1.makeSound();
    }
    //Aw yiss!!! gGt it right first try!
}