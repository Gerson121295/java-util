package com.bytebank.test;


import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardadorDeReferenciasClase;

public class TestGuardadorReferenciasClase {

    public static void main(String[] args) {

        GuardadorDeReferenciasClase guardador = new GuardadorDeReferenciasClase();

        Cuenta cc = new CuentaCorriente(22, 11);
        guardador.adicionar(cc);

        Cuenta cc2 = new CuentaCorriente(22, 22);
        guardador.adicionar(cc2);

        int tamano = guardador.getCantidadDeElementos();
        System.out.println(tamano);

        Cuenta ref = (Cuenta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());


    }
}
