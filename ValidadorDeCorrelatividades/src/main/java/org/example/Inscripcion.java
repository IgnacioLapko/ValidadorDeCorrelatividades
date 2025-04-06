package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion{
    private Integer numeroInscripcion;
    private List<Materia> materiasAinscribir = new ArrayList<>();
    /* la lista se inicializa de esta manera, a diferencia de los videos donde se inicializaba como
    private List<Materia> materiasAinscribir*/


    public Integer getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(Integer numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public List<Materia> getMateriasAinscribir(){
        return materiasAinscribir;
    }

    public void agregarMateriasAinscribir(Materia ... materias){
        Collections.addAll(this.materiasAinscribir, materias);
    }

    public boolean aprobada(Alumno unAlumno){
        return unAlumno.puedeCursar(this.materiasAinscribir);
    }


}