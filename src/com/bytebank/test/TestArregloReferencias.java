package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(23, 44);
        CuentaCorriente[] cuentas = new CuentaCorriente[5];
          //                       |new| cc |null|null|null|
            //indice -->           | 0 | 1  |  2 |  3 |  4 |

        cuentas[1] =  cc;
        System.out.println(cc);
        System.out.println(cuentas[1]);
        cuentas[0] = new CuentaCorriente(11, 99); //inicializa cuenta
        System.out.println(cuentas[0]);

        System.out.println("--------------------");
        for (int i = 0; i< cuentas.length; i ++){
            System.out.println(cuentas[i]);
        }

    }

}
