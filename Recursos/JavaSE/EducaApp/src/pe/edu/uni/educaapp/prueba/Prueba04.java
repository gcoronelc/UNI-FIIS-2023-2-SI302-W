package pe.edu.uni.educaapp.prueba;

import pe.edu.uni.educaapp.dto.AlumnoDto;
import pe.edu.uni.educaapp.service.CrudAlumnoService;

public class Prueba04 {

    public static void main(String[] args) {
        try {
            CrudAlumnoService service = new CrudAlumnoService();
            AlumnoDto dto = service.read(1);
            System.out.println("Hola: " + dto.getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
