package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Tarea1 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
public class OrdenCompra{
    private Cliente cliente;
    private ArrayList<DetalleOrden>detalleOrdens;
    private ArrayList<DocTributario>docTributarios;
    private Date fecha;
    private String estado;
    public calcPrecioSinIVA(){

    }
    public calcIVA(){

    }
    public calcPrecio(){

    }
    public calcPeso(){

    }
}
public class Cliente{
    private ArrayList<OrdenCompra>ordenCompras;
    private  String nombre;
    private String rut;
}
public class DocTributario{
    private String numero;
    private String rut;
    private Date fecha;
}
public class Pago{
    private float monto;
    private Date fecha;
}
public class DetalleOrden{
    private OrdenCompra ordenCompra;
    private int cantidad;
    public calcPrecio(){

    }
    public calcPrecioSinIVA(){

    }
    public calcIVA(){

    }
    public calcPeso(){

    }
}