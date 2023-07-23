package com.ti.sesion1;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porshe");
        cars.add("Mercedes");
        cars.add("Mercedes");
        cars.add(1);
        cars.add(11.89);

        System.out.println(cars.size());
        System.out.println(cars);

        cars.set(4, "Jaguar"); // sustituí uno de los valores y le indique la posicion del valor
        System.out.println(cars);

        int index = cars.indexOf("BMW");
        System.out.println("The first occurrence of BMW is at index " + index);

        int lastIndex = cars.lastIndexOf("Porshe");
        System.out.println("The last occurrence of Porshe is at index " + lastIndex);

        System.out.println(cars.get(2)); // traeme el que está en la posicion 2

        System.out.println(cars.get(cars.size() - 1)); // porque no existe un index 6

        // Para llamar a cada objeto de la colección
        for (Object car : cars) {
            System.out.println("the car is: " + car);
        }

        for (int i = 0; i <= cars.size(); i++) { // aqui tambien podría ir el -1
            System.out.println(("The car with normal for is " + cars.get(i)));
        }

    }
}