
package com.ti.sesion1;
import java.util.Scanner; // tengo que llamarlo para tener los inputs
public class ArithmeticOperators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();            //double es como un super float porque puedo tener muchos decimales

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1/num2;

        System.out.println("The sum of the two numbers is " + sum);
        System.out.println("The difference of the two numbers is " + sub + " and the product is " + mult);
        System.out.println("The quotient of the two numbers is " + div);


    }

}
