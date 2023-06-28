package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
    public static void main(String[] args) {



        CuentaCorriente cc = new CuentaCorriente(23, 44);
        //CuentaCorriente[] cuentas = new CuentaCorriente[5];
        //Cuenta[] cuentas = new Cuenta[5]; //CuentaCorriente extiende de Cuenta

        Object[] referencias = new Object[5]; //Usando Object compila el codigo: object es el más absorbente de todos los objetos.

        //                         |new| cc |null|null|null|
            //indice -->           | 0 | 1  |  2 |  3 |  4 |

        referencias[1] =  cc;

        Cliente cliente = new Cliente();
        referencias[4] = cliente; //lo acepta poque ahora ya se puede guardar cualquier objeto en el arreglo gracias a la declaracion de Object[]

        //castear objetos, castear sig. indicarle a Java que estos objetos son del tipo que tú le estás indicando acá.
        Cliente obtenido = (Cliente) referencias[4]; //El objeto es tipo Cliente.
        System.out.println("\n Cliente obtenido: " + obtenido);

        CuentaAhorros ca = new CuentaAhorros(44, 55);
        referencias[3] = ca;

        //System.out.println(cc);
        //System.out.println(cuentas[1]);

        referencias[0] = new CuentaCorriente(11, 99); //inicializa cuenta
        System.out.println(referencias[0]);

        //Casting: Castear el valor de cuenta para una cuenta corriente. Obligar a que cuenta sea una cuentaCorriente.
        CuentaCorriente cuenta = (CuentaCorriente) referencias[1]; //para castear se agrega: (CuentaCorriente).
        System.out.println("\n resultado del casteo: " + cuenta);


        System.out.println("\n -----Impresion de ciclo for -------");
        for (int i = 0; i< referencias.length; i ++){
            System.out.println(referencias[i]);
        }

    }

}






