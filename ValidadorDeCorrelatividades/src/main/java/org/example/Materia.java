package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas = new ArrayList<>();
    /* la lista se inicializa de esta manera, a diferencia de los videos donde se inicializaba como
    private List<Materia> materiasCorrelativas*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void agregarMateriasCorrelativas(Materia ... materias){
        Collections.addAll(this.materiasCorrelativas, materias);
    }

}
