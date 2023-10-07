package org.example;

import java.util.Date;

public class Efectivo extends Pago{
    private float monto;
    private Date fecha;

    public Efectivo(float monto, Date fecha){
        super(monto, fecha);
        setMonto(monto);
        setFecha(fecha);
    }

    public double calcDevolucion(float montoTotal) {
        if ((monto - montoTotal)<0){
            return 0.0;
        }else {
            return monto - montoTotal;
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
    public String toString() {
        return "Efectivo{" +
                "monto = " + monto +
                ", fecha = " + fecha +
                '}';
    }
}
