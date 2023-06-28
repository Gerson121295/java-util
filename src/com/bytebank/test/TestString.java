package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

import java.lang.String;//Opcion1 valida: importarlo
public class TestString {
    public static void main(String[] args) {
        String nombre = "Gerson"; //Opcion2 valida ya que java.lang = java language //Opcion mas usada.
        java.lang.String nombre1 = "Gerson"; //Opcion3 valida agregar la ruta y paquete de java.lang
        String nombre2 = new String("Gerson"); //No utilizada en el mundo real.

        //System.out.println(nombre);
        //System.out.println(nombre1);
        //System.out.println(nombre2);

        //replace: Remplaza el caracter antiguo con uno nuevo.
        System.out.println("Antes de replace: " + nombre);
        nombre = nombre.replace("G", "g"); //El resultado de la funcion replace se asigna a la variable nombre
        //Se reutiliza la refencia nombre para almacenar el resultado de replace.
        nombre = nombre.concat(" Ep");
        System.out.println("Despues de replace: " + nombre);

        //Esto se llama inmutabilidad todo String es inmutable como lo creas muere.

        nombre = nombre.toUpperCase(); //Comvierte todo el String a mayuscula
        System.out.println("Mayuscula: " + nombre); //GERSON EP

        nombre = nombre.toLowerCase(); //Comvierte todo el String a minuscula
        System.out.println("Minuscula: " + nombre); //gerson ep

        char letra = nombre.charAt(0); //Imprime el caracter que se solicita segun la posicion dada.
        System.out.println("Caracter en la posicion 0: " + letra); //Es la letra: g

        int indice = nombre.indexOf("g"); //metodo se le da la letra el trae la posicion
        System.out.println("El indice es: " + indice);

        //Siempre se debe asignar a una variable puede ser nueva o una ya existe el valor
        //retornado de la funcion.


        // ---------------  Explorando System  ---------------


        System.out.println();//Es publico y statico
        //Si no necesito instanciarlo es estatico
        //Si necesito instanciarlo no es estatico

        //usando el metodo para imprimir
        printLine("Probando el metodo de impresion String: "+nombre);
        printLine("Probando el metodo de impresion int: "+indice);
        printLine("Probando el metodo de impresion int: "+letra);
        printLine(new CuentaAhorros(200, 300));

    }


        //Metodos para imprimir: Ejemplo para conocer como funciona el System.out.println(); //cuantos metodos nos ahorramos.
        // Sobrecarga de metodos escribir el mismo nombre
        //de los metodos, pero reciben diferentes parametros.
        public static void printLine(String valor) { //Este metodo solo soporta String
            System.out.println(valor);
        }
        public static void printLine(int valor) { //Este metodo solo soporta enteros
        System.out.println(valor);
        }
        public static void printLine(char valor) { //Este metodo solo soporta char
        System.out.println(valor);
        }

        //Object para hacer uso herencia en java
    public static void printLine(Object valor) { //Este metodo solo soporta char
        System.out.println(valor.toString());
    }





}


