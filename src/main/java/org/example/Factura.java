package org.example;

import java.util.Date;

class Factura extends DocTributario {
    private Direccion direccion;//revisar
    private String numero;
    private String rut;
    private Date fecha;

    public Factura(){
        numero = null;
        rut = null;
        fecha = null;
    }

    //getters y setters
    public String getRut(){
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNumero(){
        return numero;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
