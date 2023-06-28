package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        //ArrayList nos permite usar diferentes metodos(add, get, etc) evitando
        //crear clases como la de GuardarCuentas o GuardarReferencias con esos metodos.
        //ArrayList todos los datos que se ingresan se guardan en orden como se ingresan en los indices

        //ArrayList lista = new ArrayList(); //<> Operador diamante.
        ArrayList <Cuenta> lista = new ArrayList();
        //<> Operador diamante: decir: Un Arraylist del tipo Cuenta: <> Fuerza para que acepte un tipo de objeto.
        Cuenta cc = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(13, 42);

        lista.add(cc);
        lista.add(cc2);

        //Cuenta obtenerCuenta = (Cuenta) lista.get(0);//Como ArrayList no es tipo (Cuenta) es necesario Castearlo a Cuenta.
        Cuenta obtenerCuenta = lista.get(0);//Como ArrayList el tipo es (Cuenta) no necesario Castearlo a Cuenta.

        System.out.println("\n Imprime Cuenta No." + obtenerCuenta);

        //Usando ArrayList para obtener todos los elementos.
        System.out.println("\n-----Imprime los elementos de la lista usando ciclo For -----");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }


        System.out.println("\n-----Imprime los elementos de la lista usando ciclo Foreach -----");
        //impresion usando Foreach solo se usa para obtener datos.
       // for (Object cuenta : lista){ //ArrayList: sin el <> //Por cada cuenta en la lista imprime
         for (Cuenta cuenta : lista){ //Por cada cuenta en la lista imprime esto.
        System.out.println(cuenta);
        }

    }
}
