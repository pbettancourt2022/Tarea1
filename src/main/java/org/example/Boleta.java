package org.example;

import java.util.Date;

class Boleta extends DocTributario{
    private Direccion direccion;
    private String numero;
    private String rut;
    private Date fecha;

    public Boleta(Direccion direccion, String numero, String rut, Date fecha){
        super(direccion, numero, rut, fecha);
        this.direccion = direccion;
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }

    public String getRut(){
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){this.numero = numero;}
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Direccion getDireccion(){return direccion;}
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public String toString(){
        return "Boleta{direccion = " + direccion +
                ", numero = " + numero +
                ", fecha = " + fecha +
                ", rut = " + rut +
                '}';
    }
}
