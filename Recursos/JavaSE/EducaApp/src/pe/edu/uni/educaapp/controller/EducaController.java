package pe.edu.uni.educaapp.controller;

import pe.edu.uni.educaapp.service.EducaService;

public class EducaController {

    private EducaService educaService;

    public EducaController() {
        educaService = new EducaService();
    }

    public int procMatricula(int idAlumno, int idCurso, double precio, int cuotas) {
        return educaService.procMatricula(idAlumno, idCurso, precio, cuotas);
    }

}
