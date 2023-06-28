package com.bytebank.modelo;

public class GuardadorDeReferenciasClase {
    private Object[] referencias;
    private int posicionLibre;

    public GuardadorDeReferenciasClase(){
        this.referencias = new Object[10];
        this.posicionLibre = 0;
    }

    public void adicionar(Object ref){
        referencias[this.posicionLibre] = ref;
        this.posicionLibre++;
    }

    public int getCantidadDeElementos(){
        return this.posicionLibre;
    }

    public Object getReferencia(int pos){
        return this.referencias[pos];
    }

}
