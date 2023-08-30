package pe.edu.uni.educaapp.prueba;

import java.util.List;
import pe.edu.uni.educaapp.dto.AlumnoDto;
import pe.edu.uni.educaapp.service.CrudAlumnoService;

public class Prueba06 {

    public static void main(String[] args) {
        try {
            // Datos
            AlumnoDto model = new AlumnoDto();
            model.setId(5);
            model.setNombre("coronel");
            // Proceso
            CrudAlumnoService service = new CrudAlumnoService();
            List<AlumnoDto> lista = service.readAll(model);
            for (AlumnoDto dto : lista) {
                System.out.println(dto.getId() + " - " + dto.getNombre());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
