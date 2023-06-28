package com.bytebank.test;

public class TestMain {

    public static void main(String[] args) {

        int edad = 20;
        int edad2 = 15;
        int edad3 = 67;

        //Quiero agruparlas en una sola referencia / en un solo objeto edades

        //Indices el numero de posicion que tiene cada seccion de la caja del array
        // Indice:        0   1   2   3
         //             | 1 | 2 | 3 | 4 |
        int [] edades = new int[5]; // Declaracion de Variable que engloba todas las edades, todo array debe tener un valor fijo.
        edades[2] = 30;  //En el indice 2 se guada el valor 30.

        System.out.println(edades[2]);
        System.out.println(edades[0]);

    }

    //un array es un conjunto de datos en una misma estructura de datos,

}









