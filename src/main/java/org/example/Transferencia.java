package org.example;

import java.util.Date;

public class Transferencia {
    private String banco;
    private String numCuenta;
    //monto y fecha heredado de la superclase
    private float monto;
    private Date fecha;

    public Transferencia(){
        monto = 0;
        fecha = null;
    }
    public String getBanco(){
        return banco;
    }
    public String getNumCuenta(){
        return numCuenta;
    }
    public float getMonto(){
        return monto;
    }
    public Date getFecha(){
        return fecha;
    }
}
