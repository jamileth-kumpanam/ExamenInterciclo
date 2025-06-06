package est.ups.edu.ejercicios.ejercicio1;

public class Calificacion {
    private Asignatura asignatura;
    private double nota;

    public Calificacion(Asignatura asignatura, double nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public Asignatura getAsignatura() { return asignatura; }
    public void setAsignatura(Asignatura asignatura) { this.asignatura = asignatura; }

    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }

    @Override
    public String toString() {
        return asignatura.toString() + " - Nota: " + nota;
    }
}
