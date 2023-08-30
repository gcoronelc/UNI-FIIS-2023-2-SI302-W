package pe.edu.uni.educaapp.prueba;

import pe.edu.uni.educaapp.dto.AlumnoDto;
import pe.edu.uni.educaapp.service.CrudAlumnoService;

public class Prueba08 {

    public static void main(String[] args) {
        try {
            CrudAlumnoService service = new CrudAlumnoService();
            AlumnoDto dto = service.read(1);
            System.out.println("Hola: " + dto.getNombre() + " - " + dto.getEmail());
            dto.setNombre("Julio Iglesias");
            dto.setEmail("Julio.Iglesias@uni.edu.pe");
            service.update(dto);
            System.out.println("Chau " + dto.getNombre()+ " - " + dto.getEmail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
