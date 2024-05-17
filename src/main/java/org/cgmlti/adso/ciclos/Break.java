package org.cgmlti.adso.ciclos;

public class Break {
    public static void main(String[] args) {
            //repeticion controlada por contador
            for(int i = 0; i<10; i++){
                System.out.println(i);
                if (i==5) {
                    continue;
                }
                System.out.println("Seguimos iterando");
            }

    }
}
