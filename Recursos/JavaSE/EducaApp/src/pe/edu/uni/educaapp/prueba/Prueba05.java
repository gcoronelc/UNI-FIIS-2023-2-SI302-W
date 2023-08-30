package pe.edu.uni.educaapp.prueba;

import java.util.List;
import pe.edu.uni.educaapp.dto.AlumnoDto;
import pe.edu.uni.educaapp.service.CrudAlumnoService;

public class Prueba05 {

    public static void main(String[] args) {
        try {
            CrudAlumnoService service = new CrudAlumnoService();
            List<AlumnoDto> lista = service.readAll();
            for (AlumnoDto dto : lista) {
                System.out.println("Hola: " + dto.getNombre());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
