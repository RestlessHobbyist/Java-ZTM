package org.example;

public class Car extends Vehicle{
    private String model;

    public Car(String model, String brand){
        super(brand);
        this.model = model;
    }
}
