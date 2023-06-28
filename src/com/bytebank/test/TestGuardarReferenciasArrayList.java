package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;

public class TestGuardarReferenciasArrayList {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Cuenta cc = new CuentaCorriente(22, 11);
        lista.add(cc);

        Cuenta cc2 = new CuentaCorriente(22, 22);
        lista.add(cc2);

        System.out.println("Tamano: " + lista.size());

        Cuenta ref = (Cuenta) lista.get(0);
        System.out.println("ref obtener Numero "+ref.getNumero());

        lista.remove(0);
        System.out.println("Tamano: " + lista.size());

        Cuenta cc3 = new CuentaCorriente(33, 311);
        lista.add(cc3);

        Cuenta cc4 = new CuentaCorriente(33, 322);
        lista.add(cc4);

        System.out.println("\n ------- Impresion ciclo for -------------");

        for(int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-----------------");

        for(Object oRef : lista){
            System.out.println(oRef);
        }

    }
}
