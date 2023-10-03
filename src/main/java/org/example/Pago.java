package org.example;

import java.util.Date;

abstract class Pago {
    private float monto;
    private Date fecha;

    public Pago(){
        monto = 0;
        fecha = null;
    }

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
    // Método abstracto para calcular la devolución en el caso de pago en efectivo
    public abstract double calcDevolucion(double montoPagado, double montoTotal);
}

