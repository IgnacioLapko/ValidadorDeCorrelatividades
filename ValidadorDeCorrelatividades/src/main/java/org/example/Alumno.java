package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas = new ArrayList<>();
    /* la lista se inicializa de esta manera, a diferencia de los videos donde se inicializaba como
    private List<Materia> materiasAprobadas*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean puedeCursar(List<Materia> materias){
        List<Materia> todasLasMateriasCorrelativas = materias.stream().flatMap(materia -> materia.getMateriasCorrelativas().stream()).toList();
        return this.materiasAprobadas.containsAll(todasLasMateriasCorrelativas);
    }
}
