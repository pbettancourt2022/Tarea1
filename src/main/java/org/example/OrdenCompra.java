package org.example;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Cliente cliente;
    //variable agregada para llevar cuenta de los pagos realizados
    private ArrayList<Pago> pago;
    private ArrayList<DetalleOrden> detalleOrden;
    private DocTributario docTributario;
    private Date fecha;
    private String estado;

    public OrdenCompra(Cliente cliente, ArrayList<DetalleOrden> detalleOrden , int tipoDocTributario){
        this.cliente = cliente;
        this.detalleOrden = detalleOrden;
        this.pago = new ArrayList<>();
        this.fecha = new Date();
        this.estado = "Pendiente";
        //agrega la orden a cliente
        cliente.getOrdenCompra().add(this);
        if(tipoDocTributario == 1){
            this.docTributario = new Boleta(this.cliente.getDireccion(), (this.cliente.getRut()), this.cliente.getRut(), this.fecha); //notar que el numero es el mismo que el rut simplemente para agregarle variedad y no sea el mismo para todos
        } else this.docTributario = new Factura(this.cliente.getDireccion(), (this.cliente.getRut()), this.cliente.getRut(), this.fecha);
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
    // Calcular el total de los pagos realizados hasta el momento
    // este metodo es uno de los cambios con respecto al uml, como el uml no nos da un metodo que calcule el pago es necesario agregar uno
    public float calcPago() {
        float totalPagado = 0.0F;
        for (Pago pago : this.pago) {
            totalPagado += pago.getMonto();
        }

        if (totalPagado >= calcPrecio()) {
            estado = "Vendido";
        } else {
            estado = "Parcialmente pagado";
        }
        return totalPagado;
    }
    // a su vez, este metodo tambien es agregado pues basandose en el uml no habria forma de agregar pagos a la ArrayList
    public void registrarPago(Pago pago) {
        if(pago.getMonto() < calcPrecio()) {
            this.pago.add(pago);
        }else if (!(pago instanceof Efectivo)){ //para asegurarse de que las tarjetas y transferencias no paguen mas de lo que deben
            if(pago instanceof Tarjeta) {
                this.pago.add(new Tarjeta(calcPrecio(), pago.getFecha(), ((Tarjeta) pago).getTipo(), ((Tarjeta) pago).getNumTransaccion()));
            } else if(pago instanceof Transferencia){
                this.pago.add(new Transferencia(calcPrecio(), pago.getFecha(), ((Transferencia) pago).getBanco(), ((Transferencia) pago).getNumCuenta()));
            }
        } else this.pago.add(pago); //agrega pago en caso de que sea efectivo, o que el pago sea igual al monto de la tarjeta o la transferencia
    }

    //getters y setters
    public ArrayList<Pago> getPago() {return pago;}
    public void setPago(ArrayList<Pago> pago){this.pago = pago;}
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){this.cliente = cliente;}
    public ArrayList<DetalleOrden> getDetalleOrden(){
        return detalleOrden;
    }
    public void setDetalleOrden(ArrayList<DetalleOrden> detalleOrden){this.detalleOrden = detalleOrden;}
    public DocTributario getDocTributario(){
        return docTributario;
    }
    public void setDocTributario(DocTributario docTributario){this.docTributario = docTributario;}
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){this.fecha = fecha;}
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){this.estado = estado;}
    public String toString() {
        return "OrdenCompra{" +
                "cliente = " + cliente.toString() +
                ", pagos = " + pago +
                ", detalleOrden = " + detalleOrden.toString() +
                ", docTributario = " + docTributario +
                ", fecha = " + fecha +
                ", estado = " + estado +
                '}';
    }
}
