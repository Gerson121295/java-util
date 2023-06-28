package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {

    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.depositar(200);

        //Se agregó: try catch debido a que utiliza el metodo saca y este tiene una exception
        //no se agregó throws SaldoInsuficienteException en la firma del metodo debido a que no es buena practica agregarlo al metodo main.

        try {
            cuenta.saca(200);//Al intentar retirar mas de lo que tiene la cuenta lanza la exception
            //Las exeption nos sirven para el control de errores mas detallado.
            cuenta.saca(10);

        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
            // e.printStackTrace();
        }

      /*  podemos usar el mensaje de excepción, como ya hicimos en el curso:
        throw new SacarException("Valor invalido: Saldo: " + this.saldo + ", Valor: " + valor);
        */

    }
}
