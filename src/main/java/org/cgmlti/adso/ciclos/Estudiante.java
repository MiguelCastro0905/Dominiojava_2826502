package org.cgmlti.adso.ciclos;

public class Estudiante {   
     String nombre;
    String identificacion;
    int edad;
     double nota;

    public Estudiante(String nombre, String identificacion, int edad, double nota) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }

    public int getEdad() {
        return edad;
    }

}
