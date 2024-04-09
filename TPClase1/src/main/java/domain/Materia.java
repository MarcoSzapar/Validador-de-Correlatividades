package domain;

import java.util.Arrays;
import java.util.List;

public class Materia {
    private String nombre;
    private Integer codigo;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre, Integer codigo, Materia ... materiasCorrelativas){
        this.nombre = nombre;
        this.codigo = codigo;
        this.materiasCorrelativas = Arrays.asList(materiasCorrelativas);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}
