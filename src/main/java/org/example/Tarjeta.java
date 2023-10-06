package org.example;

import java.util.Date;

public class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    //monto y fecha heredado de la superclase
    private float monto;
    private Date fecha;

    public Tarjeta(float monto, Date fecha, String tipo, String numTransaccion){
        super(monto, fecha);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    //getters y setters
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNumTransaccion(){
        return numTransaccion;
    }
    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }
    public float getMonto(float precio){
        return monto= precio;
    }
    public void setMonto(float monto){
        this.monto = monto;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    //Si saco el calcular vuelto da error
    @Override
    public double calcDevolucion(float montoPagado, float montoTotal) {
        return 0;
    }

}
