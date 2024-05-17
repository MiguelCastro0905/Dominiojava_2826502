package org.cgmlti.adso.ciclos;
import java.util.Scanner;


public class Password {
    public static void main(String[] args) {
        String password = "";
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Ingrese password");
            password = in.next();

        } 
        
        while (!password.equals("secreto") );


    }

}
