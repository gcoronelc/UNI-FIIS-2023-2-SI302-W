package pe.edu.uni.educaapp.dto;

public class CursoDto {

    private int id;
    private String nombre;
    private int vacantes;
    private int matriculados;
    private String profesor;
    private double precio;

    public CursoDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public int getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(int matriculados) {
        this.matriculados = matriculados;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
