package org.example;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Cliente cliente;
    private ArrayList<DetalleOrden> detalleOrden;
    private ArrayList<DocTributario> docTributario;
    private Date fecha;
    private String estado;

    public OrdenCompra(){
        cliente = null;
        detalleOrden = null;
        docTributario = null;
        fecha = null;
        estado = null;
    }

    public void calcPrecioSinIVA() {

    }

    public void calcIVA() {

    }

    public void calcPrecio() {

    }

    public void calcPeso() {

    }
    //a
    public Cliente getCliente(){
        return cliente;
    }
    public ArrayList<DetalleOrden> getDetalleOrden(){
        return detalleOrden;
    }
    public ArrayList<DocTributario> getDocTributario(){
        return getDocTributario();
    }
    public Date getFecha(){
        return fecha;
    }
    public String getEstado(){
        return estado;
    }
}
