package com.bytebank.modelo;

public class Cliente implements Autenticable{
    private String nombre;
    private String documento;
    private String telefono;

    private AutenticacionUtil util;  //llamada de la clase AutenticacionUtil

    public Cliente(){ //definicion del constructor para util
        this.util = new AutenticacionUtil(); //se inicializa por defecto AutenticacionUtil.(composicion de objetos)
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
