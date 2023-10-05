package org.example;

import java.util.Date;

public class Efectivo extends Pago{
    private float monto;
    private Date fecha;

    public Efectivo(float monto, Date fecha){
        super(monto, fecha);
    }
    /*
    deberíamos ver cómo ocupar la variable monto en este método, no tiene sentido no ocuparla
    pareciera que debemos agregar como parametro el precio, y ocupar el mismo monto que tenemos en la clase
    agregamos el precio en OrdenCompra con calcPrecio
     */
    @Override
    public double calcDevolucion(double montoPagado, double montoTotal) {
        if ((montoPagado - montoTotal)<0){
            return 0.0;
        }else {
            return montoPagado - montoTotal;
        }
    }

    //getters y setters
    public float getMonto(){
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
