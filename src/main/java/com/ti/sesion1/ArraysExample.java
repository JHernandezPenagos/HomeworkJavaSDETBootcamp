package com.ti.sesion1;

public class ArraysExample {
    public static void main(String[] args) {
     /*   int [] arr;
        arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i=0; i < arr.length; i++){
            System.out.println("Element at index: "+ i + " : " + arr[i]);
        }*/

        int[][] arr = { // arreglo padre o MxN o
                {2,7,9}, //el arreglo es de 4 x 3 = 4 llaves de 3 elementos
                {3,6,1},
                {7,2,4},
                {5,3,0}
        };

       //array lenght = 4

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<3; j++){
                System.out.println(arr[i][j]);
            }
        }

        }

}
