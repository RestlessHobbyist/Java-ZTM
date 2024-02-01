package org.example;

public class Main {
    public static void main(String[] args) {
//        Simple object with primitives
        Person person = new Person();
        person.name = "Cappy";
        person.age = 30;
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);

//        Objects in Objects
        Person person2 = new Person();
        person2.name = "Ron";

        Car car = new Car();
        car.model = "Ford";
        car.owner = person2;

        System.out.println("The "+car.model+" belongs to "+car.owner.name);

//        PPDTM: Pass primitive data type to method
        int number = 8;
        System.out.println("Before modify number method: "+number);
        modifyNumber(number);
        System.out.println("After modify number method: "+number);

//        Pass Object to method
        Person warrior = new Person();
        warrior.name = "Slag the Destroyer";
        warrior.age = 380;
        System.out.println("Warrior name: " + warrior.name);
        System.out.println("Warrior age: " + warrior.age);
//        ^This is Slag^
        modifyPerson(warrior);
        System.out.println("Warrior name: " + warrior.name);
        System.out.println("Warrior age: " + warrior.age);
//        ^This is Dorothy^
    }
    public static void modifyNumber(int num){
        num = num*2;
        System.out.println("Inside modify, after operation: " +num);
    }

    public static void modifyPerson(Person p){
        p.name = "Dorothy of Oz";
        p.age = 25;
    }

}