package org.example;

import java.util.Date;

public class Transferencia extends Pago {
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
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getNumCuenta(){
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public float getMonto(){
        return monto;
    }
    public Date getFecha(){
        return fecha;
    }
    @Override
    public double calcDevolucion(double montoPagado, double montoTotal) {
        // Implementa la lógica para calcular la devolución en el caso de pago por transferencia
        // Por ejemplo, puedes retornar 0.0 ya que no hay devolución en transferencias
        return 0;
    }
}
