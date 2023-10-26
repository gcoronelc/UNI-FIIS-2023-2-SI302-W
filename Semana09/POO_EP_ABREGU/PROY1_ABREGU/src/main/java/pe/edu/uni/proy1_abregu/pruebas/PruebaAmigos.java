package pe.edu.uni.proy1_abregu.pruebas;

import pe.edu.uni.proy1_abregu.services.MateService;

public class PruebaAmigos {
    
    public static void main(String[] args) {
        MateService test = new MateService();
        System.out.println(test.CalculateAmigos(220, 284));
    }
}
