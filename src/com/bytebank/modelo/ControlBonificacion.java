package com.bytebank.modelo;

public class ControlBonificacion {
    private double suma;

    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion()+this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }

    //El metodo registrarSalario que recibe funcionario funciona para los demas
    //debido a que extienden de funcionario y son funcionarios.
/*
    public double registrarSalario(Gerente gerente){
        this.suma = gerente.getBonificacion()+this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }

    public double registrarSalario(Contador contador){
        this.suma = contador.getBonificacion()+this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }
*/

}
