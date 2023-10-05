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
    public float getMonto(){
        return monto;
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

    //qué vuelto le darías a un pago con tarjeta?
    @Override
    public double calcDevolucion(double montoPagado, double montoTotal) {
        // Implementa la lógica para calcular la devolución en el caso de pago con tarjeta
        // Por ejemplo, puedes retornar 0.0 ya que no hay devolución en pagos con tarjeta
        return 0.0;
    }
}
