package com.ti.java.polymorphism.inheretance;

public class ElectricBicycle extends Vehicle{
    public void energizeEngine(){
        System.out.println("Engine energized!");
    }

    public void turnedOnScreen(){
        System.out.println("Screen turned on!");
    }

    @Override
    public void turnOn() {
        energizeEngine();
        turnedOnScreen();
    }

}
