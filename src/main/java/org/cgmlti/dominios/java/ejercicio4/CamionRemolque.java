package org.cgmlti.dominios.java.ejercicio4;

public class CamionRemolque extends Vehiculo {

    Integer capacidadCargaExtra;
    String descripcion;

    //crear un metodo que permita 
    //calcular el total de la carga maxima
    //soportado en los camiones con remolque 
    //declaracion de metodo 
    public Integer calcularTotalCarga (){
        Integer totalCarga = capacidadCarga + capacidadCargaExtra;
        
        return totalCarga;
    }

}
