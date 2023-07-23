package com.ti.sesion1;

import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num);

        //print using plus
        System.out.println("Result using plus= " + +num);

        //print using minus
        System.out.println("Result using minus= " + -num);

        //print using prefix
        System.out.println("Result prefix= " + ++num);
        System.out.println("Result prefix minus= " + --num);

        //print using postfix
        System.out.println("Result postfix= "+ num++);
        System.out.println("Result postfix minus= " + num--);
    }
}
