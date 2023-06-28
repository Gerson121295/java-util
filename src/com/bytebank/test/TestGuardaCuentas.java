package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuentas {

    public static void main(String[] args) {

        GuardaCuentas guardaCuentas = new GuardaCuentas();

        Cuenta cc = new CuentaCorriente(11, 22);
        guardaCuentas.adicionar((CuentaCorriente) cc); //Casteo a (CuentaCorriente)

        Cuenta cc2 = new CuentaCorriente(22, 44);
        guardaCuentas.adicionar((CuentaCorriente) cc2); //Casteo a (CuentaCorriente)

        guardaCuentas.obtener(1);



    }

}
