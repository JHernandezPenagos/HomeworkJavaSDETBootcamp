package com.ti.sesion1;

import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> country = new LinkedHashSet<>();
        
        country.add("Mexico");
        country.add("Canada");
        country.add("Australia");
        country.add("Argentina");

        country.add("Mexico"); // como tengo MX no lo considera
        System.out.println(country);
        System.out.println(country.size());

        country.remove("Australia");
        System.out.println("Set after removing Australia: " + country);
        System.out.println(country.size());


    }
}
