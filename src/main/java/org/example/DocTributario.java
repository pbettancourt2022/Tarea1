package org.example;

import javax.print.Doc;
import java.util.Date;

public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;

    public DocTributario(){
        numero = null;
        rut = null;
        fecha = null;
    }

    public String getRut(){
        return rut;
    }
    public String getNumero(){
        return numero;
    }
    public Date getFecha(){
        return fecha;
    }
}
