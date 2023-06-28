package com.bytebank.test;


import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

public class TestReferencias {
    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario();
        //El elemento mas generico puede ser adaptado al elemento mas especifico.
        Funcionario funcionario = new Gerente(); //xq gerente hereda de funcionario. todos los gerentes son funcionarios
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        gerente.iniciarSesion("ffff");

    }
}
