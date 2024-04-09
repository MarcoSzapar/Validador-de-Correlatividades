package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InscripcionTest {
    Materia sYO = new Materia("Sistemas y Organizaciones", 1);
    Materia aYED = new Materia("Algoritmos y Estructuras de Datos", 2);
    Materia discreta = new Materia("Matematica Discreta", 3);
    Materia aDS = new Materia("Analisis de Sistemas", 9);
    Materia pDeP = new Materia("Paradigmas de Programacion", 10);
    Materia dDS = new Materia("Disenyo de Sistemas", 17);

    @Test
    public void inscripcionEsAceptada(){
        Alumno tomi = new Alumno("Tomi", 78, sYO, aYED, discreta);
        Inscripcion inscripcion1 = new Inscripcion(tomi, aDS, pDeP);
        Assertions.assertTrue(inscripcion1.aprobada());
    }

    @Test
    public void alumnoNoTieneMateriasAprobadas(){
        Alumno lucas = new Alumno("Lucas", 5);
        Inscripcion inscripcion2 = new Inscripcion(lucas, aYED, discreta, aDS, pDeP);
        Assertions.assertFalse(inscripcion2.aprobada());
    }

    @Test
    public void inscripcionADisenyoRechazada(){
        Alumno oscar = new Alumno("Oscar", 98, aYED, sYO, discreta, pDeP);
        Inscripcion inscripcion3 = new Inscripcion(oscar, dDS);
        Assertions.assertFalse(inscripcion3.aprobada());
    }
}
