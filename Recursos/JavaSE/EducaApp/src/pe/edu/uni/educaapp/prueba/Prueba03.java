package pe.edu.uni.educaapp.prueba;

import pe.edu.uni.educaapp.dto.EmpleadoDto;
import pe.edu.uni.educaapp.service.LogonService;


public class Prueba03 {
    
    public static void main(String[] args) {
        try {
            LogonService service = new LogonService();
				 EmpleadoDto dto = service.validarUsuario("eaguero", "cazador");
				 System.out.println("Hola: " + dto.getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
