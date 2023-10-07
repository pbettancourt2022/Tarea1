package org.example;

public class DetalleOrden {
    private Articulo articulo;
    private int cantidad;

    public DetalleOrden(Articulo articulo, int cantidad){
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public double calcPrecio() {
        return calcPrecioSinIVA() + calcIVA();
    }

    public double calcPrecioSinIVA() {
        return articulo.getPrecio() * cantidad;
    }

    public double calcIVA() {
        // Supongamos un IVA del 19%
        return calcPrecioSinIVA() * 0.19;
    }
    public double calcPeso() {
        return articulo.getPeso() * cantidad;
    }

    //getters y setters
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){this.cantidad = cantidad;}
    public Articulo getArticulo(){return articulo;}
    public void setArticulo(Articulo articulo){this.articulo = articulo;}
    public String toString() {
        return "DetalleOrden{" +
                "articulo = " + articulo +
                ", cantidad = " + cantidad +
                '}';
    }
}
