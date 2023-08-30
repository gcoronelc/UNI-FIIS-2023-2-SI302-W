package pe.edu.uni.educaapp.prueba;

import pe.edu.uni.educaapp.dto.AlumnoDto;
import pe.edu.uni.educaapp.service.CrudAlumnoService;

public class Prueba09 {

    public static void main(String[] args) {
        try {
            CrudAlumnoService service = new CrudAlumnoService();
            AlumnoDto dto = service.read(12);
            if(dto == null){
                System.err.println("No existe el alumno.");
                return;
            }
            System.out.println("Hola: " + dto.getNombre());
            service.delete(12);
            System.out.println("Chau " + dto.getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
