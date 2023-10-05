package org.example;

import java.util.ArrayList;

public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public Articulo(String nombre, String descripcion, float peso, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.precio = precio;
    }

    //getters y setters
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio){this.precio = precio;}
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso){this.peso = peso;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getDescripcion(){return descripcion;}
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
}
