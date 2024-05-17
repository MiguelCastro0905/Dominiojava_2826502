package org.cgmlti.adso.ciclos;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escribir nombre del mes: ");
        String mes = in.nextLine();
        int dias = obtenerDiasDelMes(mes);

        if (dias == -1) {
            System.out.println("nombre del mes invalido");
            } else {
                System.out.println("Mes de " + mes+ " tiene   "+ dias + " Dias.") ;
                
        }
}        

        public static int obtenerDiasDelMes (String mes) {
            switch (mes) {
                case "febrero":
                    return 28; 
                    
                 case "enero":
                 case "marzo":
                 case "mayo":
                    return 31;
                    
            
                default:
                    return -1;
            }
        }
    }
    

