package org.example;

import java.util.ArrayList;

public class Articulo {
    private ArrayList<DetalleOrden> detalleOrdens;
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public Articulo(String nombre, String descripcion, float peso, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.precio = precio;
        this.detalleOrdens = new ArrayList<>();
    }

    public float getPrecio() {
        return precio;
    }
    public float getPeso() {
        return peso;
    }
}
