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
    public Date getFecha(){
        return fecha;
    }
}
