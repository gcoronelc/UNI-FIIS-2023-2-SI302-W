package pe.edu.uni.educaapp.prueba;

import pe.edu.uni.educaapp.dto.AlumnoDto;
import pe.edu.uni.educaapp.service.CrudAlumnoService;

public class Prueba07 {

    public static void main(String[] args) {
        try {
            // Datos
            AlumnoDto model = new AlumnoDto();
            model.setNombre("coronel");
            model.setDireccion("lima");
            model.setTelefono("996664457");
            model.setEmail("gcoronelc@gmail.com");
            // Proceso
            CrudAlumnoService service = new CrudAlumnoService();
            service.insert(model);
            // Reporte
            System.out.println("ID: " + model.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
