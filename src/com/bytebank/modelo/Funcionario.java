package com.bytebank.modelo;

/* La clase al ser abstracta no puede ser instanciada como tal
* Al ser abstracta es una representacion conceptual, pero no puede ser una
*representacion fisica del objeto,
*/
public abstract class Funcionario {
    private String nombre;
    private  String documento;
    private double salario;

    private int tipo;

    //Constructor: metodo de retorno del mismo tipo de la clase, puede o no aceptar parametros para asignarlos a las variables.
    public Funcionario() {
    }

    //Getter and Setters
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*
    //Este metodo no es escalabre debido a que utiliza numero para validar

    public double getBonificacion(){
        //Si tipo = 1 es gerente
        //Si tipo es 0 es funcionario
        if (this.tipo == 0){
            return this.salario * 0.1;
        }else if(this.tipo == 1) {
            return this.salario;
        }else{
            return 0;
        }
    }
*/


    //Ya no se necesita que Funcionario tenga bonificacion cada clase saca su bono
 /*   public double getBonificacion(){
            return this.salario * 0.05;
    }
*/

    //definimos un metodo abstracto el metodo de bonificicacion debido a que
    // solo lo definimos y las clases hijas seran las encargadas de implementarlo
    // sobreescribirlo
    /* Definimos un metodo abstracto ya que no queremos que tenga una
    implentacion(codigo dentro o el cuerpo) para dejar que sea implementado por las
    clases hijas(que describan el codigo de funcionalidad del metodo)
        */
    public abstract double getBonificacion();
//Tanto para la clase y el metodo abstracto: Al ser abstracto conceptualmente exite pero
// no exite realmente, no tiene implementacion. Este metodo obliga a las clases hijas a sobreescribirlas

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


}
