package org.cgmlti.adso.ciclos;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vendedor> vendedores = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            System.out.println("Ingrese el nombre del vendedor " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese el número de unidades vendidas por " + nombre + ":");
            int unidadesVendidas = Integer.parseInt(scanner.nextLine());

            Vendedor vendedor = new Vendedor(nombre, unidadesVendidas);
            vendedores.add(vendedor);

            i++;
        }

        Vendedor vendedorMaximo = vendedores.get(0);
        for (Vendedor vendedor : vendedores) {
            if (vendedor.compararUnidadesVendidas(vendedorMaximo)) {
                vendedorMaximo = vendedor;
            }
        }

       
        System.out.println("El vendedor con más unidades vendidas es: " + vendedorMaximo.Nombre() +
                " con " + vendedorMaximo.UnidadesVendidas() + " unidades vendidas.");
    }

    
}