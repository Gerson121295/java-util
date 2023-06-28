package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.SaldoInsuficienteException;

import com.bytebank.modelo.*; //permite importar todas las clases
// que se encuentren en la clase modelo.

public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1,1);
        CuentaAhorros ca = new CuentaAhorros(2,3);

        cc.depositar(2000);

        //Se agregó: try catch debido a que utiliza el metodo saca y este tiene una exception
        //no se agregó throws SaldoInsuficienteException en la firma del metodo debido a que no es buena practica agregarlo al metodo main.

        try {
            cc.transferir(1000, ca);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }


        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());


    }
}
