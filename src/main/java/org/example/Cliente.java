package org.example;

import java.util.ArrayList;

public class Cliente{
    private ArrayList<OrdenCompra> ordenCompras;
    private Direccion direccion;//revisar
    private String nombre;
    private String rut;
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion; //agregado
        this.ordenCompras = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public ArrayList<OrdenCompra> getOrdenCompra(){
        return ordenCompras;
    }

}
