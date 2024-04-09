package domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasSolicitadas;

    public Inscripcion(Alumno alumno, Materia ... materiasSolicitadas){
        this.alumno = alumno;
        this.materiasSolicitadas = Arrays.asList(materiasSolicitadas);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Materia> getMateriasSolicitadas() {
        return materiasSolicitadas;
    }

    private boolean cumpleCorrelativasDe(Materia materia){
        List<Materia> materiasAprobadas = this.alumno.getMateriasAprobadas();
        List<Materia> correlativas = materia.getMateriasCorrelativas();

        //El IDE recomendó usar HashSet para que no sea poco performante :/
        return new HashSet<>(materiasAprobadas).containsAll(correlativas);
    }

    public boolean aprobada(){
        return this.materiasSolicitadas.stream().allMatch(materia -> cumpleCorrelativasDe(materia));
    }
}
