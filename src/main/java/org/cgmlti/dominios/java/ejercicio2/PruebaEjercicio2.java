package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {

    public static void main(String[] args) {
        
        //crear 2 instancias de cada Entidad
        //instanciar 2 veces cada Entidad
        //Crear 2 objetos de cada Entidad
        //1. Nombre de la clase a Instanciar
        //2. Nombre del objeto (identificador)
        //3. Operador de asignancion
        //4. palabra(referencia) new
        //5. otra vez, el nombre de la clase
        //6. Parentesis (Constructor)  
        Hospital hospital1 = new Hospital();
        Hospital h1 = new Hospital();
        
        //acceder a los atributos del objeto
        //operador .
        //1. identificador del objeto 
        //2. el punto
        //3. el atributo a trabajar
        //4. el operador de asignacion
        //5. el valor a asignar al atributo        
        hospital1.direccion = "Caracas con 52";
        h1.nombre = "Para especiales";
        h1.telefono = 314024548L;

        //crear 3 Medicos:
        Medico m1 = new Medico();
        m1.nombre="Miguel Rodriguez";
        m1.cedula= 541542545L;
        m1.especialidad="CARDIOLOGIA";

        Medico m2 = new Medico();
        m2.nombre = "Perro platon";
        m2.cedula = 48749837L;
        m2.especialidad = "Oncologia";

        Medico m3 = new Medico();
        m3.nombre = "Angel tercero";
        m3.cedula = 74879378L;
        m3.especialidad = "ODONTOLOGIA";

        // añadir medicos al hospital
        hospital1.listaMedicos.add(m1);
        hospital1.listaMedicos.add(m2);
        hospital1.listaMedicos.add(m3);

        //RECORRER LA LISTA DE MEDICOS
        // DEL HOSPITAL
        for( Medico medicoRecorrer : hospital1.listaMedicos ){
            System.out.println("Medico: " + 
                                medicoRecorrer.cedula
                                );
        }

        // Crear salas

        SalaHospital s1 = new SalaHospital();
        s1.numero = 123;
        s1.cantidadCamas = 5;
        
        SalaHospital s2 = new SalaHospital();
        s2.numero = 122;
        s2.cantidadCamas = 4;
        
        //agregar salas
        hospital1.listaSalas.add(s1);
        hospital1.listaSalas.add(s2);
         
        //Recorrer listaSalas
        for(SalaHospital salaHospitalRecorrer : hospital1.listaSalas){
            System.out.println("SalaHospital: " +
                                    salaHospitalRecorrer.cantidadCamas);
        }

        
    }

}
