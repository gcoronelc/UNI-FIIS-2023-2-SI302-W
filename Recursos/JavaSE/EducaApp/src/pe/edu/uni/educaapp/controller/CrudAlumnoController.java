package pe.edu.uni.educaapp.controller;

import java.util.List;
import pe.edu.uni.educaapp.dto.AlumnoDto;
import pe.edu.uni.educaapp.service.CrudAlumnoService;

public class CrudAlumnoController {

    private CrudAlumnoService service;

    public CrudAlumnoController() {
        service = new CrudAlumnoService();
    }

    public AlumnoDto read(int codigo) {
        return service.read(codigo);
    }

    public List<AlumnoDto> readAll() {
        return service.readAll();
    }

    public List<AlumnoDto> readAll(AlumnoDto model) {
        return service.readAll(model);
    }

    public void insert(AlumnoDto model) {
        service.insert(model);
    }

    public void update(AlumnoDto model) {
        service.update(model);
    }

    public void delete(int codigo) {
        service.delete(codigo);
    }
}
