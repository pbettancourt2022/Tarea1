package org.example;

import java.util.ArrayList;

public class Direccion {
    private ArrayList<Cliente> clientes;
    private ArrayList<DocTributario> docTributarios;
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
        this.clientes = new ArrayList<>();
        this.docTributarios = new ArrayList<>();
    }
}
