package org.example;

import java.util.ArrayList;

public class Cliente{
    private ArrayList<OrdenCompra> ordenCompra;
    private Direccion direccion;//revisar
    private String nombre;
    private String rut;
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion; //agregado
        this.ordenCompra = new ArrayList<>();
    }

    //getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){this.rut = rut;}
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion){this.direccion = direccion;}
    public ArrayList<OrdenCompra> getOrdenCompra(){return ordenCompra;}
    public void setOrdenCompra(ArrayList<OrdenCompra> ordenCompra){this.ordenCompra = ordenCompra;}

}
