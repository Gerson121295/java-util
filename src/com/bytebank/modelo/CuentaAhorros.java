package com.bytebank.modelo;

public class CuentaAhorros extends Cuenta{

    //Generate --Constructor
    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }


}
