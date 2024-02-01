package org.example;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int batteryCap){
        super(brand,model);
        this.batteryCapacity = batteryCap;

    }
}
