package pe.edu.uni.educaapp.prueba;

import pe.edu.uni.educaapp.dto.AlumnoDto;
import pe.edu.uni.educaapp.dto.CursoDto;
import pe.edu.uni.educaapp.service.CrudAlumnoService;
import pe.edu.uni.educaapp.service.CrudCursoService;

public class Prueba10 {

    public static void main(String[] args) {
        try {
            // Datos
            CursoDto model = new CursoDto();
            model.setNombre("Java Junior");
            model.setVacantes(50);
            model.setMatriculados(0);
            model.setProfesor("Yo");
            model.setPrecio(1200);
            // Proceso
            CrudCursoService service = new CrudCursoService();
            service.insert(model);
            // Reporte
            System.out.println("ID: " + model.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
