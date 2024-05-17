package org.cgmlti.adso.ciclos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese el nombre del estudiante (o 'fin' para terminar):");
            String nombre = scanner.nextLine();
            if (nombre.equals("fin")) {
                break;
            }

            System.out.println("Ingrese la identificación del estudiante:");
            String identificacion = scanner.nextLine();

            System.out.println("Ingrese la edad del estudiante:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del número entero

            System.out.println("Ingrese la nota del estudiante:");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea después del número decimal

            Estudiante estudiante = new Estudiante(nombre, identificacion, edad, nota);
            listaEstudiantes.add(estudiante);
        }

        double minimaNota = Double.MAX_VALUE;
        double maximaNota = Double.MIN_VALUE;
        double sumaNotas = 0;
        int cantidadEstudiantesMayoresEdad = 0;

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getNota() < minimaNota) {
                minimaNota = estudiante.getNota();
            }
            if (estudiante.getNota() > maximaNota) {
                maximaNota = estudiante.getNota();
            }
            if (estudiante.getEdad() >= 18) {
                sumaNotas += estudiante.getNota();
                cantidadEstudiantesMayoresEdad++;
            }
        }

        double promedioNotasMayoresEdad = cantidadEstudiantesMayoresEdad > 0 ?
                                           sumaNotas / cantidadEstudiantesMayoresEdad :
                                           0;

        System.out.println("La mínima nota es: " + minimaNota);
        System.out.println("La máxima nota es: " + maximaNota);
        System.out.println("El promedio de notas para estudiantes mayores de edad es: " + promedioNotasMayoresEdad);

        scanner.close();
    }
}



