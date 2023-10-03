package org.example;

import java.util.Date;

public class Efectivo extends Pago{
    //hereda monto y fecha de la super clase
    @Override
    public double calcDevolucion(double montoPagado, double montoTotal) {
        if ((montoPagado - montoTotal)<0){
            return 0.0;
        }else {
            return montoPagado - montoTotal;
        }
    }
}
