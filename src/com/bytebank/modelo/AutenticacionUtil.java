package com.bytebank.modelo;

public class AutenticacionUtil {
    private String clave;
    //private String clave = "CursosOnLine";

    public boolean iniciarSesion(String clave){
        return this.clave == clave; //Si cumple es true, sino es false.
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}

