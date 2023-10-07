package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Tarea1 {
    public static void main(String[] args) {
        // Crear compradores
        Direccion direccionCliente1 = new Direccion("Calle 1, Ciudad 1");
        Cliente cliente1 = new Cliente("Cliente 1", "123456789", direccionCliente1);

        Direccion direccionCliente2 = new Direccion("Calle 2, Ciudad 2");
        Cliente cliente2 = new Cliente("Cliente 2", "987654321", direccionCliente2);

        // Crear productos
        Articulo producto1 = new Articulo("Producto 1", "Descripción 1", 1.5f, 1000.0f);
        Articulo producto2 = new Articulo("Producto 2", "Descripción 2", 2.0f, 1500.0f);
        Articulo producto3 = new Articulo("Producto 3", "Descripción 3", 0.5f, 5000.0f);
        Articulo producto4 = new Articulo("Producto 4", "Descripción 4", 1.0f, 2000.0f);
        Articulo producto5 = new Articulo("Producto 5", "Descripción 5", 3.0f, 12000.0f);

        // Crear detalles de compra
        ArrayList<DetalleOrden> Lista1 = new ArrayList<DetalleOrden>() {{
            add(new DetalleOrden(producto1, 1));
            add(new DetalleOrden(producto2, 2));
            add(new DetalleOrden(producto3, 3));
        }};
        ArrayList<DetalleOrden> Lista2 = new ArrayList<DetalleOrden>() {{
            add(new DetalleOrden(producto4, 4));
            add(new DetalleOrden(producto5, 2));
        }};
        ArrayList<DetalleOrden> Lista3 = new ArrayList<DetalleOrden>() {{
            add(new DetalleOrden(producto1, 1));
            add(new DetalleOrden(producto3, 2));
        }};

        // Crear órdenes de compra
        OrdenCompra orden1 = new OrdenCompra(cliente1, Lista1, 1);
        OrdenCompra orden2 = new OrdenCompra(cliente2, Lista2, 1);
        OrdenCompra orden3 = new OrdenCompra(cliente2, Lista3, 2);

        // Calcula e imprime el precio total de las órdenes
        float precioTotalOrden1 = orden1.calcPrecio();
        float precioTotalOrden2 = orden2.calcPrecio();
        float precioTotalOrden3 = orden3.calcPrecio();

        // Registrar pagos
        Efectivo pagoEfectivo1 = new Efectivo(25000.0f, new Date(2023, 11, 8));
        orden1.registrarPago(pagoEfectivo1);
        double devolucion1 = pagoEfectivo1.calcDevolucion(orden1.calcPrecio());
        System.out.println(" ");
        System.out.println( "Total de la Orden 1 sin iva: $" + orden1.calcPrecioSinIVA());
        System.out.println("Precio total de Orden 1: $" + precioTotalOrden1);
        System.out.println("Monto pagado: $" + orden1.calcPago());
        System.out.println("Devolución para Orden 1: $" + devolucion1);
        System.out.println("Estado de la Orden 1: " + orden1.getEstado());

        System.out.println(" ");

        Transferencia pagoTransferencia1 = new Transferencia(precioTotalOrden2/2, new Date(2023, 10, 03), "Banco A", "12345");
        orden2.registrarPago(pagoTransferencia1);//pago 1 transferencia
        orden2.registrarPago(pagoTransferencia1);//pago 2 transferencia
        System.out.println("Total de la Orden 2 sin iva incluido: $" + orden2.calcPrecioSinIVA());
        System.out.println("Precio total de Orden 2: $" + precioTotalOrden2);
        System.out.println("Monto pagado: $" + orden2.calcPago());
        System.out.println("Estado de la Orden 1: " + orden2.getEstado());
        System.out.println(" ");

        Tarjeta pagoTarjeta1 = new Tarjeta(100000.0f, new Date(2023, 7, 03), "Visa", "54321");
        orden3.registrarPago(pagoTarjeta1);
        System.out.println("Total de la Orden 3 sin iva: $" + orden3.calcPrecioSinIVA());
        System.out.println("Precio total de Orden 3: $" + precioTotalOrden3);
        System.out.println("Monto pagado: $" + orden3.calcPago());
        System.out.println("Estado de la Orden 3: " + orden3.getEstado());
        System.out.println(orden1.getDocTributario());
        System.out.println(orden2.getDocTributario());
        System.out.println(orden3.getDocTributario());
    }
}

