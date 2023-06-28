package com.bytebank.modelo;

//public class SaldoInsuficienteException extends RuntimeException{
  public class SaldoInsuficienteException extends Exception{

    //Declaracion del constructor de SaldoInsuficienteException
    SaldoInsuficienteException(String mensaje){ //Cada vez que lance esa excepcion, yo voy a mandarle un mensaje y el por medio del constructor de la clase padre exception el va a seterar el mensaje.
        super(mensaje);
    }
}
