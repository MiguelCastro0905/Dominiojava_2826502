package org.cgmlti.dominios.java.ejercicio4;

public class Vehiculo {
    Long codigo;
    Boolean estaDisponible;
    Integer capacidadCarga;
   
    //constructor por defecto es:
    //no tien parametros
    public Vehiculo() {
        System.out.println("Ingreso al constructor" + "por defecto");
        
    }

    public Vehiculo(Long codigo,
                    Boolean estaDisponible,
                    Integer capacidadCarga) {
                        
        this.codigo = codigo;
        this.estaDisponible = estaDisponible;
        this.capacidadCarga = capacidadCarga;
    }
    

    
}
