package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {

        //crear una instancia de vehiculo:
        Vehiculo vehiculo1 = new Vehiculo(5426565L, true, 45);


        //crear un objeto viaje
        Viaje v = new Viaje();

        //Invocacion : LLamado , ejecicucion, utilizacion 
        v.calcularDuracionViaje(LocalDate.of(2024, 4, 26), 
                                LocalDate.of(2024, 4, 29 ));


        //invocacion de la sobrecarga
        System.out.println("Duracion en dias del viaje: " + v.calcularDuracionViaje());                     
        
        //instanciar  un ejemplar 
        
        //de cada tipo de vehiculo

        

        Camion c1 = new Camion();
        c1.estaDisponible = true;
       
        c1.elTalViajeQueHizoElCamion = v;

        //establecer el viaje
        //del camion:



        CamionRemolque cr1 = new CamionRemolque();
        cr1.capacidadCargaExtra =  9;
        cr1.capacidadCarga = 10;

        //invocar el metodo creado
        Integer totalCarga = cr1.calcularTotalCarga();
        System.out.println("total carga: "+ totalCarga);



        System.out.println("El viaje del camion: " +
                            "tiene fecha de inicio:" + c1.elTalViajeQueHizoElCamion.fechaInicio);

        System.out.println("El viaje del camion: " +
                            "tiene fecha de fin:" + c1.elTalViajeQueHizoElCamion.fechaFin);                    
        
          


    }
}
