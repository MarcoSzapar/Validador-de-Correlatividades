package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, Integer legajo, Materia ... materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = Arrays.asList(materiasAprobadas);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
