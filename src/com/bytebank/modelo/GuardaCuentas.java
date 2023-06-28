package com.bytebank.modelo;

public class GuardaCuentas { //Clase utilitaria donde estaran los metodos a usar

    //Crear un objeto para guardar muchas cuentas
    //Permitir agregar cuentas con un metodo
    //guardarCuentas.adiciona(cuenta);
    //obtener, remover, etc.


    //Indice:    | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |  9 |
    //           | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |

    Cuenta[]  cuenta = new Cuenta[10];
    int indice = 0;

    public void adicionar(CuentaCorriente cc) {

        cuenta[indice] = cc;
        indice++;

    }

    public Cuenta obtener(int indice){
        return cuenta[indice];
    }

}












