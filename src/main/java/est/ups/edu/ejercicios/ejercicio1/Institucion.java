package est.ups.edu.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Institucion {
    private String nombre;
    private List<Curso> cursos;

    public Institucion(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Curso> getCursos() { return cursos; }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Institución: " + nombre + ", Cursos: " + cursos;
    }
}
