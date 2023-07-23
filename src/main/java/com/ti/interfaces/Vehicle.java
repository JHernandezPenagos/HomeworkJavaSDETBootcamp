package com.ti.interfaces;

public interface Vehicle {
    int MAXIMUM_SPEED = 120;

    String stop(int quantity);

    String accelerate(int quantity);

    void vehicleName(String name);
}
