package com.ti.exceptions;

public class ExceptionsExamples {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        int[] arr = new int[4]; //tamaño de lista

        int i = arr[4]; //indice de lista

        //System.out.println(a/b);
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println(b/a);
            //System.out.println(e); // --> me trae el error java.lang.ArithmeticException: / by zero
            //System.err.println(e); // --> me trae el error java.lang.ArithmeticException: / by zero pero en ROJO
            System.err.println("Not able division by Zero"); //--> me trae el error customizado en ROJO
        } finally { //independientemente de los errores, si o si ejecutame lo siguiente:
            System.out.println("Value of a is: " + a + " and b is: " + b);
        }
    }
}
