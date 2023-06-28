package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
    public static void main(String[] args) {

        /*
        los tipo de datos primitivos (int, char) guarda el valor que se le da al objeto.
        Un objeto como un String guarda la referencia de la memoria head
         */

        int[] mumeros  = new int [10];
        int numero = 40;

        Integer numeroObjeto = new Integer(40); //Integer esta deprecated - ya no se va usar.
        //deprecado: Se corre el riesgo de que nuestro codigo en el fututo no sea compatible con java.
        List<Integer> lista = new ArrayList(); //se puede agregar ArrayList, Vector o LinkedList
        //No puede haber una lista de primitivos: la lista no puede guardar primitivos(int, char, etc.) solo objetos(String, Integer, etc.).
        //primitivo != object
        lista.add(numero);//Autoboxing: Autoguardado, Automaticamente java el numero lo inicializa como Integer. lista.add(new Integer(40));
        lista.add(numeroObjeto);


    }
}
