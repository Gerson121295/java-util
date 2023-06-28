package com.bytebank.modelo;

/**
 * Estructura para la documentacion
 * Cuenta va a crear nuevas instancias de CuentaCorriente.
 * @version 1.0
 * @author Gerson121295
 */

public abstract class Cuenta {
    //private double saldo; //cambio a private : encapsulamiento para que no se pueda obtener y modificar sin usar el metodo set o get
    protected double saldo; //Protected saldo es accesible desde las clases hijas.
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente(); //Referencia el atributo titular a la clase Cliente

    //Este si permite numeros negativos, por lo que no se usa, se usa el modificado en nuestro proyecto.

   // public Cuenta(){ } //Crear uno debido a que se creo uno modificado por lo que Java no lo puege generar automaticamente.

    //static indica que esta variable no sera de la instancia si no de si no de la clase
    private static int total=0; //para contar cuantas cuentas hay creadas

    /**
     * Instancia una nueva cuenta sin parametros
     *
     */
    public Cuenta(){
    }

    /**
     *Instancia una cuenta usando agencia y numero.
     * @param agencia
     * @param numero
     */

    public Cuenta (int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Cuenta No. "+ total + " creadas");
        System.out.println("Estoy creando una cuenta "+ this.numero);
        Cuenta.total ++;
    }


 /*
    public Cuenta(int agencia){ //Metodo que retorna nuestro objeto Cuenta
        //Validar que el atributo no sea menor a 0
        if (agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else {
            this.agencia=agencia;
        }
        total++;
        System.out.println("Cuenta No. "+ total + " creadas");
    }
*/


    //Otra forma la variable parametro no es igual a atributos de la clase
//   public void depositar(double valor){
//        saldo = saldo + valor;
//    }

    //Metodo no retorna valor
    /*
    public void depositar(double valor){ //Pudo ser saldo el parametro
        //Esta cuenta      Esta cuenta
        //This account      This account
        //This object  : this al atributo que esta en la clase
        this.saldo   =  this.saldo + valor;
    }
    */
    //Comvertimos el metodo depositar(anterior) en abstracta
    public abstract void depositar(double valor);


    //Metodo retorna valor
    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }

    //Transfiere llama al metodo saca que tiene una exeption tipo Exeption por lo que transfiere se ve afectado por lo que se le agrega al metodo throws SaldoInsuficienteException
    public boolean transferir(double valor, Cuenta destino) throws SaldoInsuficienteException { //agreado: throws SaldoInsuficienteException otra opcion seria agregar un try catch al metodo saca
        if (this.saldo >= valor) {
            //this.saldo = this.saldo - valor;
            this.saca(valor);
            destino.depositar(valor);
            return true;
        }else {
            return false;
        }

            //cuenta.depositar(valor); //cuenta.saldo = cuenta.saldo + valor;
           // return true;
        //}
        //return false;
    }


    /*
    public boolean saca(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
*/
/*
    //Nuevo Metodo saca implentando exception: RuntimeException
    public void saca(double valor){
        if(this.saldo < valor) { //excepciones o validacion van al inicio del metodo.
            throw new SaldoInsuficienteException("No tienes saldo");
     }
        this.saldo -= valor; //Si sacas dinero te resto el valor de tu cuenta, sino te devuelvo un exception.
    }
*/

    /**
     * Este metodo retira dinero de la cuenta y su ocurre un error devuelve una excepcion.
     * @param valor
     * @throws SaldoInsuficienteException
     */
    //Nuevo Metodo saca implentando exception: Exception
    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) { //excepciones o validacion van al inicio del metodo.
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo -= valor; //Si sacas dinero te resto el valor de tu cuenta, sino te devuelvo un exception.
    }

    //Metodo para obtener get
    public double getSaldo(){
        return this.saldo;
    }

    //Metodo para modificar set : asignar  : eliminar ya que se agrego la validacion en el constructor para que se fuerze al pedir la informacion
    public void setAgencia(int agencia){
        if(agencia > 0 ){ //validacion para evitar ingresar numeros < 0
            this.agencia = agencia;
        }else{
            System.out.println("no estan permitidos valores negativos");
        }
    }

    // Metodo getAgencia
    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        return Cuenta.total; //Acceder a la variable total desde un metodo
    }
}
