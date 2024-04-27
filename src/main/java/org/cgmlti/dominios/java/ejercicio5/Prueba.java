package org.cgmlti.dominios.java.ejercicio5;



public class Prueba {
    public static void main(String[] args) {
        Ciudad c1 = new Ciudad("Medellin");
        Ciudad c2 = new Ciudad("Cartagena");
        Ciudad c3 = new Ciudad("Popayan");

        c1.nombre = "Medellin";
        c2.nombre = "Cartagena";
        c3.nombre = "Popayan";
        
       

        Pais p1 = new Pais("Colombia");
        p1.nombre = "Colombia";

        Ruta r1 = new Ruta(13);
        r1.numero = 13;
        r1.listaCiudad.add(c1);
        r1.listaCiudad.add(c2);
        r1.listaCiudad.add(c3);

        System.out.println("ruta: "+ r1.numero);
        
        for(Ciudad ciudadRuta : r1.listaCiudad ){
            System.out.println("Ciudad: "+ 
                                        ciudadRuta.nombre);
        
            


        }

        
        
        


    }

    


    
        
    

}
