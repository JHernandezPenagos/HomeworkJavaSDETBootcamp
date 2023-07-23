package com.ti.java.polymorphism.inheretance;

public class Airplane extends Vehicle {
    public void fuelMix(){
        System.out.println("Fuel mixed!");
    }

    public void injectFuel(){
        System.out.println("Fuel injected!");
    }

    public void turnOn(){
        fuelMix();
        injectFuel();
    }

}
