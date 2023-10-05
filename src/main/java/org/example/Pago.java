package org.example;

import java.util.Date;

//viendo el uml, pareciera que no debería ser abstracta la clase
abstract class Pago {
    private float monto;
    private Date fecha;

    public Pago(){
        monto = 0;
        fecha = null;
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

    //calcDevolucion no debería pertenecer a Pago, solo se usa en Efectivo

    // Método abstracto para calcular la devolución en el caso de pago en efectivo
    public abstract double calcDevolucion(double montoPagado, double montoTotal);
}

