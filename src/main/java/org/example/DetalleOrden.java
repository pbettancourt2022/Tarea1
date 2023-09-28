package org.example;

public class DetalleOrden {
    private OrdenCompra ordenCompra;
    private int cantidad;

    public DetalleOrden(){
        ordenCompra = null;
        cantidad = 0;
    }

    public void calcPrecio(){}

    public void calcPrecioSinIVA() {}

    public void calcIVA() {}

    public void calcPeso() {}

    public OrdenCompra getOrdenCompra(){
        return ordenCompra;
    }
    public int getCantidad(){
        return cantidad;
    }
}
