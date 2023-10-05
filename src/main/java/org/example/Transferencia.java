package org.example;

import java.util.Date;

public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    private float monto;
    private Date fecha;

    public Transferencia(float monto, Date fecha, String banco, String numCuenta){
        super(monto, fecha);
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
    public float getMonto(){
        return monto;
    }
    public void setMonto(float monto){
        this.monto = monto;
    }
    public Date getFecha(){
        return fecha;
    }
    public void setDate(Date fecha){this.fecha = fecha;}

    //calcDevolucion debería estar solamente en Efectivo, qué vuelto le darías a una transferencia? lol
    @Override
    public double calcDevolucion(double montoPagado, double montoTotal) {
        // Implementa la lógica para calcular la devolución en el caso de pago por transferencia
        // Por ejemplo, puedes retornar 0.0 ya que no hay devolución en transferencias
        return 0;
    }
}
