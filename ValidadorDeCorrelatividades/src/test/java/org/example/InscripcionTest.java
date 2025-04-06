package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Inscripcion de alumno que tiene aprobadas todas las correlativas para poder inscribirse a las materias que desea.")
    public void inscripcionAprobada(){
        Materia ayed = new Materia();
        ayed.setNombre("Algoritmos y Estructuras de Datos");

        Materia pdp = new Materia();
        pdp.setNombre("Paradigmas de Programación");
        pdp.agregarMateriasCorrelativas(ayed);

        Materia dds = new Materia();
        dds.setNombre("Diseño de Sistemas");
        dds.agregarMateriasCorrelativas(pdp);

        Materia ami = new Materia();
        ami.setNombre("Análisis Matemático I");

        Materia amii = new Materia();
        amii.setNombre("Paradigmas de Programación");
        amii.agregarMateriasCorrelativas(ami);

        Alumno unAlumno = new Alumno();
        unAlumno.setNombre("Pedro Pascal");
        unAlumno.agregarMateriasAprobadas(ayed,pdp,ami);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setNumeroInscripcion(111);
        inscripcion.agregarMateriasAinscribir(dds,amii);

        Assertions.assertTrue(inscripcion.aprobada(unAlumno));
    }

    @Test
    @DisplayName("Intento de inscripción de alumno que no tiene todas las correlativas aprobadas para poder inscribirse a las materias que desea.")
    public void inscripcionNoAprobada(){
        Materia ayed = new Materia();
        ayed.setNombre("Algoritmos y Estructuras de Datos");

        Materia pdp = new Materia();
        pdp.setNombre("Paradigmas de Programación");
        pdp.agregarMateriasCorrelativas(ayed);

        Materia dds = new Materia();
        dds.setNombre("Diseño de Sistemas");
        dds.agregarMateriasCorrelativas(pdp);

        Materia ami = new Materia();
        ami.setNombre("Análisis Matemático I");

        Materia amii = new Materia();
        amii.setNombre("Paradigmas de Programación");
        amii.agregarMateriasCorrelativas(ami);

        Alumno unAlumno = new Alumno();
        unAlumno.setNombre("Roberto Musso");
        unAlumno.agregarMateriasAprobadas(ayed);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setNumeroInscripcion(112);
        inscripcion.agregarMateriasAinscribir(dds,amii);

        Assertions.assertFalse(inscripcion.aprobada(unAlumno));
    }
    @Test
    @DisplayName("Intento de inscripción de alumno que no tiene ninguna de las correlativas aprobadas para poder inscribirse a las materias que desea.")
    public void inscripcionNoAprobada2(){
        Materia ayed = new Materia();
        ayed.setNombre("Algoritmos y Estructuras de Datos");

        Materia pdp = new Materia();
        pdp.setNombre("Paradigmas de Programación");
        pdp.agregarMateriasCorrelativas(ayed);

        Materia dds = new Materia();
        dds.setNombre("Diseño de Sistemas");
        dds.agregarMateriasCorrelativas(pdp);

        Materia ami = new Materia();
        ami.setNombre("Análisis Matemático I");

        Materia amii = new Materia();
        amii.setNombre("Paradigmas de Programación");
        amii.agregarMateriasCorrelativas(ami);

        Alumno unAlumno = new Alumno();
        unAlumno.setNombre("Pity Álvarez");
        unAlumno.agregarMateriasAprobadas(ayed,ami);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setNumeroInscripcion(113);
        inscripcion.agregarMateriasAinscribir(dds,amii);

        Assertions.assertFalse(inscripcion.aprobada(unAlumno));
    }
}