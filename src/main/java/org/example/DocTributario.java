package org.example;

import javax.print.Doc;
import java.util.Date;

public class DocTributario {
    private Direccion direccion;//revisar
    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario(){
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
