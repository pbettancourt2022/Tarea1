package org.example;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Cliente cliente;
    private ArrayList<DetalleOrden> detalleOrdens;
    private ArrayList<DocTributario> docTributarios;
    private Date fecha;
    private String estado;

    public OrdenCompra(Cliente cliente){
        this.cliente = cliente;
        this.detalleOrdens = new ArrayList<>();
        this.docTributarios = new ArrayList<>();
        this.fecha = new Date();
        this.estado = "Pendiente";
    }
    public void agregarDetalle(DetalleOrden detalle) {
        detalleOrdens.add(detalle);
    }

    public float calcPrecioSinIVA() {
        float precioSinIVA = 0.0F;
        for (DetalleOrden detalle : detalleOrdens) {
            precioSinIVA += detalle.calcPrecioSinIVA();
        }
        return precioSinIVA;
    }

    public float calcIVA() {
        float IVA = 0.0F;
        for (DetalleOrden detalle : detalleOrdens) {
            IVA += detalle.calcIVA();
        }
        return IVA;
    }

    public float calcPrecio() {
        return calcPrecioSinIVA() + calcIVA();
    }

    public float calcPeso() {
        float pesoTotal = 0.0F;
        for (DetalleOrden detalle : detalleOrdens) {
            pesoTotal += detalle.calcPeso();
        }
        return pesoTotal;
    }
    public void asociarDocumentoTributario(DocTributario documento) {
        docTributarios.add(documento);
        //añadido
    }
    public void registrarPago(Pago pago) {
        // Implementa la lógica para registrar pagos aquí
        //añadido
    }

    public Cliente getCliente(){
        return cliente;
    }
    public ArrayList<DetalleOrden> getDetalleOrden(){
        return detalleOrdens;
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
