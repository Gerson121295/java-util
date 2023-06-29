package com.bytebank.test;

public class TestWrappers {

    public static void main(String[] args) {
        double numeroDoble = 33.0; //se cumple el concepto de autoboxing
        boolean verdadero = true; //se cumple el concepto de autoboxing

        double numeroDouble2 = Double.valueOf(33);

        System.out.println(numeroDouble2);

        String numeroString = "43";//igual a: String numeroString = new String("43");

        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);

        System.out.println(stringToDouble);
        System.out.println(stringToInteger);

        //todos los tipo de numeros extienden de Number
        Number numero = Integer.valueOf(5);
        double numeroDoublePrim = numero.doubleValue(); //unboxing

        Boolean falso = Boolean.FALSE; //es igual a: Boolean falso = false;




    }

}
