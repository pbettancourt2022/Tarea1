package org.example;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Cliente cliente;
    private ArrayList<Pago> pagos;
    private ArrayList<Date> fechasPago;
    private ArrayList<DetalleOrden> detalleOrden;
    private ArrayList<DocTributario> docTributario; //nota que, de acuerdo al uml, debería haber únicamente un docTributario
    private Date fecha;
    /*
    con respecto a estado, debería cambiar viendo si se paga completamente ordenCompra, o si falta por pagar
    fijarse en el enunciado, "Un cliente puede pagar en varios plazos, y a veces en diferentes fechas"
     */
    private String estado;

    public OrdenCompra(Cliente cliente){
        this.cliente = cliente;
        this.detalleOrden = new ArrayList<>();
        this.docTributario = new ArrayList<>();
        this.pagos = new ArrayList<>();
        this.fechasPago = new ArrayList<>();
        this.fecha = new Date();
        this.estado = "Pendiente";
    }
    public void agregarDetalle(DetalleOrden detalle) {
        detalleOrden.add(detalle);
    }
    public float calcPrecioSinIVA() {
        float precioSinIVA = 0.0F;
        for (DetalleOrden detalle : detalleOrden) {
            precioSinIVA += detalle.calcPrecioSinIVA();
        }
        return precioSinIVA;
    }

    public float calcIVA() {
        float IVA = 0.0F;
        for (DetalleOrden detalle : detalleOrden) {
            IVA += detalle.calcIVA();
        }
        return IVA;
    }

    public float calcPrecio() {
        return calcPrecioSinIVA() + calcIVA();
    }

    public float calcPeso() {
        float pesoTotal = 0.0F;
        for (DetalleOrden detalle : detalleOrden) {
            pesoTotal += detalle.calcPeso();
        }
        return pesoTotal;
    }
    public void asociarDocumentoTributario(DocTributario documento) {
        docTributario.add(documento);
        //añadido
    }
    public void registrarPago(Pago pago, Date fechaPago) {
        pagos.add(pago);
        fechasPago.add(fechaPago);


    }
    // Calcular el total de los pagos realizados hasta el momento
    public float calcularTotalPagado() {
        float totalPagado = 0.0F;
        for (Pago pago : pagos) {
            totalPagado += pago.getMonto();
        }
        return totalPagado;
    }

    // Obtener la lista de fechas de pago
    public ArrayList<Date> getFechasPago() {
        return fechasPago;
    }

    // Obtener la lista de pagos
    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    //getters y setters
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){this.cliente = cliente;}
    public ArrayList<DetalleOrden> getDetalleOrden(){
        return detalleOrden;
    }
    public void setDetalleOrdens(ArrayList<DetalleOrden> detalleOrdens){this.detalleOrden = detalleOrdens;}
    public ArrayList<DocTributario> getDocTributario(){
        return getDocTributario();
    }
    public void setDocTributarios(ArrayList<DocTributario> docTributarios){this.docTributario = docTributarios;}
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){this.fecha = fecha;}
    public String getEstado(){
        return estado;
    }
    public void setEstado(){
        String estado;
        if (calcularTotalPagado() >= calcPrecio()) {
            estado="Vendido";
        } else {
            estado="Parcialmente pagado";
        }
        this.estado = estado;
    }
}
