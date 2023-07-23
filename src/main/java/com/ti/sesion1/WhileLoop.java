package com.ti.sesion1;

public class WhileLoop {
    public static void main(String[] args) {
     /*   int i = 1;

        while(i<6)     {   // me imprime hasta el 5
            System.out.println("El número es: " + i);
            i++; // para parar el bucle*/

        int x = 1;
        int sum = 0;

        while(x<=10){
            //sum = sum + x;
            sum += x;
            x++;
        }
        System.out.println("Summation: "+ sum);
    }
}
