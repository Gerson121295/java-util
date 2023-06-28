package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {

        //ArrayList nos permite usar diferentes metodos(add, get, etc) evitando
        //crear clases como la de GuardarCuentas o GuardarReferencias con esos metodos.
        //ArrayList todos los datos que se ingresan se guardan en orden como se ingresan en los indices

        //ArrayList lista = new ArrayList(); //<> Operador diamante.
        //ArrayList <Cuenta> lista = new ArrayList();

        List<Cliente> listaClientes = new LinkedList<>();  //lista anexada con clientes.

        //List<Cuenta> lista = new LinkedList<>(); //Implementacion de list --java.util para la practica de vectores.

        //Es obligatorio especificar el tipo de lista en el primer <>, en el segundo<> no es obligatorio pero se puede hacer.
        //List<Cuenta> lista = new Vector<>();//vector un unico objeto para todas las pilas de ejecucion.
        //El vector ya no es muy usado, porque es Thread safe.

        List<Cuenta> lista = new ArrayList<>(); //usando Collection


        //<> Operador diamante: decir: Un Arraylist del tipo Cuenta: <> Fuerza para que acepte un tipo de objeto.

        //Referencia | objeto --> se guarda en la memoria Heap
        Cuenta cc    = new CuentaCorriente(11, 22);
        Cuenta cc2   = new CuentaCorriente(13, 42);
        Cuenta cc3   = new CuentaCorriente(11, 22);

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

        System.out.println("\n");

         //Verificar si la lista contiene un elemento.
        boolean contiene = lista.contains(cc3); //utiliza contains que tiene el metodo Equals el cual se declaro y sobreescribio en cuenta.
         if(contiene){//Compara por referencia.
             System.out.println("Si, es igual (equals).");
         }

         //Este metodo no es necesario porque el Equals ya hace ese trabajo.
      //   if(cc.esIgual(cc3)){ //Compara por Valores, Verifica si las cuentas son iguales.
        //     System.out.println("Si, son iguales.");
         //}





    }
}
