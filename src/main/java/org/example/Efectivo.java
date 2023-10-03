package org.example;

import java.util.Date;

public class Efectivo extends Pago{
    //hereda monto y fecha de la super clase
    private float monto;
    private Date fecha;

    public Efectivo(){
        monto = 0;
        fecha = null;
    }

    public float calcDevolucion(){
        //implementar metodo para calcular devolucion
        return monto;
    }
    public float getMonto(){
        return monto;
    }
    public Date getFecha(){
        return fecha;
    }
}
