package javaapplication9.prueba;

import javaapplication9.herencia.Clase1;
import javaapplication9.herencia.Clase2;

public class Prueba02 {

    public static void main(String[] args) {
        Clase1 o = new Clase2();
        System.out.println("9 + 7: " + o.sumar(9, 7));
    }
}
