package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDateTime;

public class Prueba {

    public static void main(String[] args) {

        //crear un objeto viaje
        Viaje v = new Viaje();
        v.fechaInicio = LocalDateTime.of(2024, 4, 26, 22, 30, 0);
        v.fechaFin = LocalDateTime.of(2024, 4, 29, 16, 30, 0);
        
        //instanciar  un ejemplar 
        
        //de cada tipo de vehiculo

        

        Camion c1 = new Camion();
        c1.estaDisponible = true;
       
        c1.elTalViajeQueHizoElCamion = v;

        //establecer el viaje
        //del camion:



        CamionRemolque cr1 = new CamionRemolque();
        cr1.capacidadCargaExtra =  9;

        System.out.println("El viaje del camion: " +
                            "tiene fecha de inicio:" + c1.elTalViajeQueHizoElCamion.fechaInicio);

        System.out.println("El viaje del camion: " +
                            "tiene fecha de fin:" + c1.elTalViajeQueHizoElCamion.fechaFin);                    
        
          


    }
}
