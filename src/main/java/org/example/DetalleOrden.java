package org.example;

public class DetalleOrden {
    private OrdenCompra ordenCompra;
    private Articulo articulo;//revisar
    private int cantidad;

    public DetalleOrden(Articulo articulo, int cantidad){
        ordenCompra = null;
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

    public OrdenCompra getOrdenCompra(){
        return ordenCompra;
    }
    public int getCantidad(){
        return cantidad;
    }
}
