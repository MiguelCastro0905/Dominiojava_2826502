package org.cgmlti.dominios.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        
        //crear un estudiante con nota
        Estudiante estudiante = new Estudiante(1);
        

        //si la calificacion de estudiuante es mayor o igual
        // imprimir aprobado 

        //-----------------------------------------------------------------------------------------------------------------------------


        //Lenguajes donde se considera: c++, PHP, Java, JavaScript
            // se púede dejar sin corchetes 
            //Si el if tiene una sola instruccion
            //en su bloque de codigo

        if(estudiante.nota ==5) {
            
            System.out.println("Felicitaciones");
            System.out.println("Que hp mas bilingüe");
    
        }else if(estudiante.nota >= 4 && estudiante.nota < 5){
            System.out.println("Muy bien ");
            System.out.println("sacaste B");
        }else if(estudiante.nota >= 3 && estudiante.nota > 4){
            System.out.println("Buen intento");
            System.out.println("Sacaste A");
        }else{
            //El else debe ir siempre de ultimas
            System.out.println("Lo sentimos");
            System.out.println("Sacaste I");
            if(estudiante.nota <= 1){
                System.out.println("Se va a comite");
                System.out.println("Para condicionamiento");
            }else if(estudiante.nota >= 1.1 && 
                     estudiante.nota < 2 ){
                System.out.println("Plan de mejoramiento");
            }else if(estudiante.nota < 2.1 && 
            estudiante.nota < 3){
                System.out.println("Llamado de atencion");
            }
        }

        System.out.println("Instruccion independiente");
    }
}