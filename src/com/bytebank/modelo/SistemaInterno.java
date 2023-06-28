package com.bytebank.modelo;

public class SistemaInterno {
    private String clave = "CursosOnLine";
    public boolean autentica(Autenticable gerente){ //Autenticable es una interfaz
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);

        if(puedeIniciarSesion){
            System.out.println("Bienvenido Login Exitoso");
            return true;
        }else {
            System.out.println("Error en Login");
            return false;
        }
    }
}
