package org.example;

import javax.print.Doc;
import java.util.Date;

public abstract class DocTributario {
    private Direccion direccion;
    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario(Direccion direccion, String numero, String rut, Date fecha){
        this.direccion = direccion;
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
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
}
