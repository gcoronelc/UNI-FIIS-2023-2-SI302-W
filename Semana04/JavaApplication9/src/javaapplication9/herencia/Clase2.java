package javaapplication9.herencia;

public class Clase2 extends Clase1{
    
    private int nota = 5;
    
    public void mostrarNota(){
        System.out.println("Nota del padre: " + super.nota);
        System.out.println("Nota: " + nota);
    }

    @Override
    public int sumar(int n1, int n2) {
        return super.sumar(n1, n2) * (n1 - n2);
    }
    
    
    
}
