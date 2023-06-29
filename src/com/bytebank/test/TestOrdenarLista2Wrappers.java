package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLista2Wrappers {

    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaCorriente(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaCorriente(22, 22);
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

        Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta2();

        //   lista.sort(c);//espera cualquier cosa que extienda de cuenta
        lista.sort(comparator);//sort recibe una implementacion de la interfaz comparator

        System.out.println("\n---Impresion Despues de ordenar ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

        //Comparador de cuenta por Orden alfabetico de Nombre de titular
        Comparator<Cuenta> comparatorNombreTitular = new OrdenadorPorNombreTitular();
        lista.sort(comparatorNombreTitular);//sort recibe una implementacion de la interfaz comparator

        System.out.println("\n---Impresion ordena por orden alfabetico Nombre de Titular ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }
    }
}

//Ordenador por numero de cuenta.
class OrdenadorPorNumeroCuenta2 implements Comparator<Cuenta> {

    /*//Forma basica No1 Ordenar: Funciona pero es mas codigo.
    @Override //Sobreescribe el metodo compare
    public int compare(Cuenta o1, Cuenta o2) {
        if(o1.getNumero() == o2.getNumero()){
            return 0;
        }else if(o1.getNumero() > o2.getNumero()){
            return 1;
        }else {
            return -1;
        }
    }
    */

  /*  //Forma Intermedia No2 Ordenar: Funciona mas simplificado
    @Override //Sobreescribe el metodo compare
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getNumero() - o2.getNumero();
    }
*/

    //Forma Wrapper No3 Ordenar: Funciona mas simplificado
    @Override //Sobreescribe el metodo compare
    public int compare(Cuenta o1, Cuenta o2) {
        return Integer.compare(o1.getNumero(), o2.getNumero()); //Integer.compare(x,y); donde x = primer No.Cuenta, y=2do. No. CUenta.
    }



}


//Orden Alfabetico por nombre de Titular
class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

    //Se implementa el metodo compare
    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getTitular().getNombre()
                //compareTo retorna un entero.
                .compareTo(o2.getTitular().getNombre()); //utiliza el metodo compareTo para comparar el otro nombre titular
    }
}

