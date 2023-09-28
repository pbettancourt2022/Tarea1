package org.example;

import java.util.ArrayList;

public class Cliente{
    private ArrayList<OrdenCompra> ordenCompra;
    private String nombre;
    private String rut;
    public Cliente(){
        ordenCompra = null;
        nombre = null;
        rut = null;
    }
    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public ArrayList<OrdenCompra> getOrdenCompra(){
        return ordenCompra;
    }
}
