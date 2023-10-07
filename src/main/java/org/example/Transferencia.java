package org.example;

import java.util.Date;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    private float monto;
    private Date fecha;

    public Transferencia(float monto, Date fecha, String banco, String numCuenta){
        super(monto, fecha);
        this.monto = monto;
        this.fecha = fecha;
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    //getters y setters
    public String getBanco(){
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getNumCuenta(){
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public float getMonto(float precio){
        return monto=precio;
    }
    public void setMonto(float monto){
        this.monto = monto;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setDate(Date fecha){this.fecha = fecha;}

    public String toString() {
        return "Transferencia{" +
                "monto = " + monto +
                ", fecha = " + fecha +
                ", banco = " + banco +
                ", numCuenta = " + numCuenta+
                '}';
    }
}
