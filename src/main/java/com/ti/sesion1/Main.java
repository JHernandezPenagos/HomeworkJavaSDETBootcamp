package com.ti.sesion1;

public class Main {

    public static void main(String[] args) {
        //primitives

        int number1 = 20;
        int number2 = 20;

        int result = number1 + number2;


        System.out.println("result = " + result);

        float pi = 3.14f;
        boolean isAdult = true;

        String test = "test";

        char a = '\u0000';

        byte b = -128;
        short c = -32768;
        int d = 10_000_006;
        int e = 10000006; // No es una buena practica

        System.out.println(d);

    }
}
