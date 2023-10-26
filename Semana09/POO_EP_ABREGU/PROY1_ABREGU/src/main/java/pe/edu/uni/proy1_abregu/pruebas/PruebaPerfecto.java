package pe.edu.uni.proy1_abregu.pruebas;

import pe.edu.uni.proy1_abregu.services.MateService;

public class PruebaPerfecto {
    
    public static void main(String[] args) {
        //Creacion
        MateService test = new MateService();
        //Verificacion de funciones
        //Modifique el 28
        System.out.println(test.CalculatePerfect(28));
    }
}
