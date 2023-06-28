package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Funcionario;

public class TestFuncionario {
    public static void main(String[] args) {

        //Funcionario gerson = new Funcionario();
        Funcionario gerson = new Contador(); //ahora la clase Funcionario es abstracta
        gerson.setDocumento("Gerson");
        gerson.setDocumento("444556665");
        gerson.setSalario(2000);
        gerson.setTipo(0);

        System.out.println(gerson.getSalario());

        System.out.println(gerson.getBonificacion());
    }
}
