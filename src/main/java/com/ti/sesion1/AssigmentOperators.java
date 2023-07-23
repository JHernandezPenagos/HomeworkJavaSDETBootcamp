package com.ti.sesion1;

import java.util.Scanner;

public class AssigmentOperators {
    public static void main(String[] args) {
      /*  int num1 = 5;
        int num2 = 3;*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        num1 %= num2;

        System.out.println(num1);
    }
}
