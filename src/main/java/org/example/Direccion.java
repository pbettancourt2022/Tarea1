package org.example;

import java.util.ArrayList;

public class Direccion {
    /*
    revisar cliente y docTributario (los cambie a no ser ArrayList, pero me entro la duda)
    */
    private Cliente cliente;
    private DocTributario docTributario;
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
        this.cliente = null;
        this.docTributario = null;
    }


    //getters y setters
    public Cliente getCliente(){return cliente;}
    public void setCliente(Cliente cliente){this.cliente = cliente;}
    public DocTributario getDocTributario(){return docTributario;}
    public void setDocTributario(DocTributario docTributario){this.docTributario = docTributario;}
    /*
    public String getDireccion(){return direccion;}
    public void setDireccion(String direccion){this.direccion = direccion;}
     */
}
