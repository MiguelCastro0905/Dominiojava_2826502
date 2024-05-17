package org.cgmlti.adso.ciclos;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        String nota = "";
        String flag = "y";
        //contador para cada nota:
        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;
        int contadorD = 0;
        
        do{
            System.out.println("ingrese nota: ");
            nota = in.next();
            switch (nota) {
                case "A":contadorA+=1; 
                    break;
                case "B":contadorB++;
                    break;
                case "C":contadorC++;
                    break;
                case "D":contadorD+=1;
                    break;
                default:
                    System.out.println("nota invalida");
                    break;
                    
            }
          
            System.out.println("¿Desea continuar? y/n");
            flag = in.next();
            
        }while(flag.equals("y"));
        in.close();
        System.out.println("");
        System.out.println("se ingreso A: "+ contadorA);
        System.out.println("se ingreso B: "+ contadorB);
        System.out.println("se ingreso C: "+ contadorC);
        System.out.println("se ingreso D: "+ contadorD);

    }

}
