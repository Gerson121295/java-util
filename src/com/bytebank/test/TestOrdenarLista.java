package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLista {
    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(22, 33);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaCorriente(22, 44);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaCorriente(22, 22);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("---Impresion Antes de ordenar ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

        //Ordenar las cuentas: ¿Que tipo de orden quiero?
        //Comparator <? extend Cuenta> = Cualquier clase hija de cuenta o la cuenta. //Comparator es la interfaz

        Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();

        //   lista.sort(c);//espera cualquier cosa que extienda de cuenta
        lista.sort(comparator);

        System.out.println("---Impresion Despues de ordenar ---");
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

    }


}

//Ordenador por numero de cuenta.
    class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

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
    }
