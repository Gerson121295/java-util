package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestLambda {

    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(62, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaCorriente(32, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaCorriente(2, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("\n---Impresion Antes de ordenar ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

        //Ordenar las cuentas: ¿Que tipo de orden quiero?
        //Comparator <? extend Cuenta> = Cualquier clase hija de cuenta o la cuenta. //Comparator es la interfaz

        // ---------  Usando Lambdas ----------

        lista.sort((Cuenta o1, Cuenta o2) -> { //Esta flecha --> dice Estos parametros envialos a la operacion(que esta en return). //no es necesario enviarle el tipo de Cuenta
            //usando forma 3 de Wrappers //Codigo estan en las clase OrdenadorPorNumeroCuenta3 de abajo.
            return Integer.compare(o1.getNumero(), o2.getNumero()); //Integer.compare(x,y); donde x = primer No.Cuenta, y=2do. No. CUenta.
            } //Si se agrega las llaves se agrega return, si no, no agregar el return.
        );

        System.out.println("\n---Impresion Despues de ordenar ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }


/*
        //Forma 1:Instanciar una interfaz
        Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta3();
        //   lista.sort(c);//espera cualquier cosa que extienda de cuenta
        // lista.sort(comparator);//sort recibe una implementacion de la interfaz comparator //Este usa la clase: OrdenadorPorNumeroCuenta3 de abajo

        //forma 2 Clase anonima: Permite definir el metodo y la funcionalidad para ordenar aqui mismo. Ya que el sort permite una interface de comparator
        //Esas clases que se le agrega donde se necesita el codigo se llama clase anonima.
        //Las clases anonimas se crean las hace java, pero no lo hacemos nosotros.
        lista.sort(new Comparator<Cuenta>() { //una interfaz nunca se puede instanciar
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                //usando forma 3 de Wrappers //Codigo estan en las clase OrdenadorPorNumeroCuenta3 de abajo.
                return Integer.compare(o1.getNumero(), o2.getNumero()); //Integer.compare(x,y); donde x = primer No.Cuenta, y=2do. No. CUenta.
            }
        });

        System.out.println("\n---Impresion Despues de ordenar ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }
*/


        //Comparador de cuenta por Orden alfabetico de Nombre de titular
        //Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular2();
        //lista.sort(comparatorNombreTitular);  //sort recibe una implementacion de la interfaz comparator


/*
        //Orden Natural: sin instanciar una interfaz, solo se llama como parametro.
        lista.sort(new OrdenadorPorNombreTitular());//sort recibe una implementacion de la interfaz comparator
        //InterfazFuncional son aquellas que tienen un solo metodo, para implementar. Ejemplo: es el compare.

        System.out.println("\n---Impresion ordena por orden alfabetico Nombre de Titular ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

        //Forma antigua de Ordenar

        //Orden Natural: para java 8, 7 o menores.
        Collections.sort(lista, new OrdenadorPorNombreTitular2()); //recibe la lista y un metodo ordenador. //implementacion de la interfaz
        System.out.println("\n---Impresion ordena por orden alfabetico Nombre de Titular usa Collections. ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

 */



        //Usando Lambdas - Para el codigo anterior

        Collections.sort(lista, (c1,c2) -> //no es necesario enviarle el tipo de Cuenta
             c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre())
        ); //no es necesario agregarle llaves y el return.

        System.out.println("\n---Impresion ordena por orden alfabetico Nombre de Titular usa Lambda. ---");
        /*
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }
        */
        //Usando lambda para imprimir la lista en lugar del for

        //forma 1
//        lista.forEach((Cuenta cuenta) -> {
//                    System.out.println(cuenta);
//                });

        //Forma2:
//        lista.forEach((Cuenta cuenta) ->
//            System.out.println(cuenta)
//        );

        //Forma3:
        lista.forEach(cuenta -> System.out.println(cuenta));



        /*
        //No es necesario instanciar una clase o enviarle un metodo ordenador si no que se implementa la interface Comparator
        //Orden Natural: para java 8, 7 o menores.
        //Esas clases que se le agrega la funcionalida, donde se necesita el codigo se llama clase anonima.
        Collections.sort(lista, new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta o1, Cuenta o2) {
                return o1.getTitular().getNombre()
                        //compareTo retorna un entero.
                        .compareTo(o2.getTitular().getNombre()); //utiliza el metodo compareTo para comparar el otro nombre titular
            }
        });
        System.out.println("\n--- new Comparator ---");
        System.out.println("\n---Impresion ordena por orden alfabetico Nombre de Titular usa Collections. ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }
*/


/*
        //Orden Natural: Solo se le envia la lista - para java 8, 7 o menores.
        Collections.sort(lista); //SI usamos el orden natural y solo enviamos la lista debemos ir a la class cuenta para especificar el orden, el cual en Cuenta se debe de implementar Comparable (implements Comparable<Cuenta> e implementar su metodo)
        System.out.println("\n---Impresion ordena por orden de Numero de Saldo (agencia) usa Collections solo se envia la lista ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

 */

    }

}
