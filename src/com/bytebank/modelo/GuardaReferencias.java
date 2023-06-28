package com.bytebank.modelo;

public class GuardaReferencias { //crea un arreglo de Object para guardar cualquier tipo de referencias.

    //Crear un objeto para guardar muchas cuentas
    //Permitir agregar cuentas con un metodo
    //guardarCuentas.adiciona(cuenta);
    //obtener, remover, etc.


    //Indice:    | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |  9 |
    //           | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |

    Object[] referencia = new Object[10]; //Arreglo de Object llamado referencia lo inicializa con 10;
    int indice = 0;

    public void adicionar (Object cc){
        referencia[indice] = cc;
        indice++;
    }

    public Object obtener(int indice){
        return referencia[indice];
    }




}
