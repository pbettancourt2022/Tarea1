package org.example;

import java.util.Date;

public class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    //monto y fecha heredado de la superclase
    private float monto;
    private Date fecha;

    public Tarjeta(){
        monto = 0;
        fecha = null;
    }


    public String getTipo(){
        return tipo;
    }
    public String getNumTransaccion(){
        return numTransaccion;
    }
    public float getMonto(){
        return monto;
    }
    public Date getFecha(){
        return fecha;
    }
}
