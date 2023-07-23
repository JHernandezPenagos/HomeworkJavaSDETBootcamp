package com.ti.sesion1;

public class TernaryOperator {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int res;

       /* if(n1>n2){
            System.out.println(n1+n2);
        }else {
            System.out.println(n1-n2);
        }*/

       /* System.out.println((n1>n2)?(n1+n2):(n1-n2));*/

        res = (n1>n2)?(n1+n2):(n1-n2); // se puede agregar a una variable tambien

        System.out.println("Result = " + res);
    }
}
