package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.ControlBonificacion;
import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

public class TestControlBonificacion {
    public static void main(String[] args) {

        //Funcionario gerson = new Funcionario();
        Funcionario gerson = new Contador(); //ahora la clase Funcionario es abstracta
        gerson.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador alex = new Contador();
        alex.setSalario(5000);


        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(gerson);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alex);

        System.out.println();
    }
}
