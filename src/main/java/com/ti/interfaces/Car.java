package com.ti.interfaces;

public class Car implements Vehicle{
    int speed = 0;
    @Override
    public String stop(int quantity) {
        speed -= quantity;
        if (speed <= 0) {
            return "La velocidad es cero";
        }
        return "The car has stopped and is going " + speed + "km/hr";
    }

    @Override
    public String accelerate(int quantity) {
        String speeding = "";
        speed += quantity;
        if (speed>MAXIMUM_SPEED)
            speeding = "Speeding";
            speeding += "The car has accelerated and is going " + speed + "kn/hr";
        return speeding;
    }

    @Override
    public void vehicleName(String name) {
        System.out.println("I'm a Mustang!");

    }
}
