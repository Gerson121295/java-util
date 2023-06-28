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

        //Integer numeroObjeto = new Integer(40); //Integer esta deprecated - ya no se va usar.
        //deprecado: Se corre el riesgo de que nuestro codigo en el fututo no sea compatible con java.

        //Metodo recomendado de declarar Integer a a la lista.
        Integer numeroObjeto = Integer.valueOf(40);

        List<Integer> lista = new ArrayList(); //se puede agregar ArrayList, Vector o LinkedList
        //No puede haber una lista de primitivos: la lista no puede guardar primitivos(int, char, etc.) solo objetos(String, Integer, etc.).
        //primitivo != object
        lista.add(numero);//Autoboxing: Autoguardado, Automaticamente java el numero lo inicializa como Integer. lista.add(new Integer(40));
        //Forma correcta de declararlo
        lista.add(Integer.valueOf(40)); //lista.add(new Integer(40));
        lista.add(numeroObjeto);

        /*
        El concepto de autoboxing, el cual consiste en que automáticamente él va a mapear el valor
        del primitivo número a un objeto entero. ¿Cómo? Creando pues una instancia de este objeto entero,
        esto ya sería una instancia.
        */

        // unboxing: extrae el int del Integer y se la da a la variable del primitivo.
        int valorPrimitivo = numeroObjeto; //Java dice: Este objeto se igual al primitivo
        //otra forma de decirle, pero en el codigo de la linea anterior java lo hace automatico.
        //int valorPrimitivo = numeroObjeto.intValue(); //java dice: al Objeto retorna su valor int.

        byte byteInteger = numeroObjeto.byteValue(); //retorna el valor en byteValue();
        double doubleInteger = numeroObjeto.doubleValue();//retorna el valor en doubleValue();
        float floatInteger = numeroObjeto.floatValue(); // retorna el valor en float();

        //Cual es el tamaño que soporta un tipo de dato(int) usando MAX_VALUE
        System.out.println(Integer.MAX_VALUE);//El valor maximo que el entero puede guardar
        System.out.println(Integer.MIN_VALUE);//El valor minimo que el entero puede guardar

        //Cuantos byte soporta de informacion
        System.out.println(Integer.SIZE); //retorna el dato en bits
        System.out.println(Integer.BYTES);//Retorna el dato en BYTES



    }
}
