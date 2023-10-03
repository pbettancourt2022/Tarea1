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
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNumTransaccion(){
        return numTransaccion;
    }
    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }
    public float getMonto(){
        return monto;
    }
    public Date getFecha(){
        return fecha;
    }
    @Override
    public double calcDevolucion(double montoPagado, double montoTotal) {
        // Implementa la lógica para calcular la devolución en el caso de pago con tarjeta
        // Por ejemplo, puedes retornar 0.0 ya que no hay devolución en pagos con tarjeta
        return 0.0;
    }
}
