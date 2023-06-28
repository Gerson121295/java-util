package com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable{
    private AutenticacionUtil util;

    public Administrador(){
        this.util = new AutenticacionUtil();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }


    /*///Este metodo ya no se implementa de esta manera.- se definio en AutenticacionUtil-
    @Override
    public boolean iniciarSesion(String clave) {
        return this.clave == clave; //retorna true si cumple, sino false
    }
*/
    @Override
    public double getBonificacion() {
        return this.getSalario();
    }
}
