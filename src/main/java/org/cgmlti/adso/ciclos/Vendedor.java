package org.cgmlti.adso.ciclos;

class Vendedor {
    private String nombre;
    private int unidadesVendidas;

    public Vendedor(String nombre, int unidadesVendidas) {
        this.nombre = nombre;
        this.unidadesVendidas = unidadesVendidas;
    }

    public String Nombre() {
        return nombre;
    }

    public int UnidadesVendidas() {
        return unidadesVendidas;
    }

    // Método para comparar unidades vendidas
    public boolean compararUnidadesVendidas(Vendedor otroVendedor) {
        return this.unidadesVendidas > otroVendedor.unidadesVendidas;
    }
}
    
  

