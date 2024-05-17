package org.cgmlti.adso.ciclos;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la talla: ");
        String tallaUS = scanner.next();

        String resultado = obtenerTalla(tallaUS);
        
        if (resultado.equals("")) {
            System.out.println("La talla ingresada no es válida.");
        } else {
            System.out.println("La talla " + tallaUS + " US es considerada " + resultado);
        }

        scanner.close();
    }

    public static String obtenerTalla(String tallaUS) {
        String resultado = "";
        switch ((String) tallaUS) {
            case "6":
            case "6.5":
            case "7":
            case "7.5":
            case "8":
            case "8.5":
                resultado = "PEQUEÑA";
                break;
            case "9":
            case "9.5":
            case "10":
            case "10.5":
            case "11":
            case "11.5":
                resultado = "MEDIANA";
                break;
            case "12":
            case "12.5":
            case "13":
            case "13.5":
            case "14":
                resultado = "GRANDE";
                break;
            default:
                resultado = "";
                break;
        }
        return resultado;
    }
}



