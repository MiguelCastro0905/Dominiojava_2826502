package org.cgmlti.dominios.java.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    String nombre;
    String direccion;
    Long telefono;

    //Lista de medicos :
    //tambien es un atributo
    //de los objetos hospital

    List<Medico> listaMedicos = 
                new   ArrayList<Medico>();
    
    List<SalaHospital> listaSalas =
                new ArrayList<SalaHospital>();
                            
    


}
