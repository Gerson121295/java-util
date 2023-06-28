package com.bytebank.modelo;


//Gerente hereda los atributos de Funcionario por lo cual no es necesario
//definir los atributos.

public class Gerente extends Funcionario implements Autenticable{ //Gerente Extiende de funcionario


//Usando la palabra super tenemos acceso a los metodos de la clase padre que estan en private
    //Sobreescritura de metodo: cuando en la clase padre y en la hija hay un metodo con el mismo nombre.
public double getBonificacion(){
    System.out.println("EJECUTANDO DESDE GERENTE");
    return super.getSalario() +
            this.getSalario() * 0.5;
           // (super.getSalario()*0.1); //Para no escribir esto
          //  super.getBonificacion();//con super accedemos al metodo bono de clase madre
}


    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
