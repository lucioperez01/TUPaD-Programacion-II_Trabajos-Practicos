package ecommerse;
public class Ecommerse {
    public static void main(String[] args) {
        // crear productos
        Producto producto01 = new Producto("JFK837", "Pantalon jeans", 1689.5);
        Producto producto02 = new Producto("JKD907", "Remera Sara", 119.5);
        Producto producto03 = new Producto("PEO346", "Gorra blanca", 67.3);
        Producto producto04 = new Producto("NME342", "Bermudas", 35.7);
        Producto producto05 = new Producto("FPY063", "Shorts", 43.1);
        Producto producto06 = new Producto("BRE863", "Top negro", 25.6);
        Producto producto07 = new Producto("MNV567", "Pack de medias", 10.4);
        Producto producto08 = new Producto("CBO512", "Blusa beige", 73);
        
        // crear clientes
        Cliente cliente01 = new Cliente("Mario Sanchez", 35398156);
        Cliente cliente02 = new Cliente("Delia Diaz", 39859321);
        Cliente cliente03 = new Cliente("Juan Lopez", 37335955);
        
        // crear pedidos - pedido 1
        Pedido pedido01 = new Pedido("001", cliente01);
        pedido01.agregarProducto(producto01);
        pedido01.agregarProducto(producto03);
        pedido01.agregarProducto(producto07);
        
        pedido01.calcularTotal(); 
        pedido01.mostrarTicket();
        
        pedido01.procesarPago(1000.0, MetodoDePago.PAYPAL); //no se realiza por fondos insuficientes
        pedido01.procesarPago(3000.0, MetodoDePago.TRANSFERENCIA);  // se paga y se guarda el nombre para el proximo pago
        
        // crear pedidos - pedido 2
        Pedido pedido02 = new Pedido("002", cliente02);
        pedido02.agregarProducto(producto08);
        pedido02.agregarProducto(producto06);
        pedido02.agregarProducto(producto02);
        
        pedido02.mostrarTicket();
        pedido02.aplicarDescuento(20); // se aplica descuento del 20%
        
        
        cliente02.notificarEstado();    //se notifica al cliente
        pedido02.procesarPago(2500, MetodoDePago.PAYPAL); // se paga y se guarda para el proximo
        cliente02.notificarEstado();       // se notifica
        
        
        Pedido pedido03 = new Pedido("003", cliente03 );
        pedido03.agregarProducto(producto05);
        pedido03.agregarProducto(producto07);
        pedido03.agregarProducto(producto04);
        
        pedido03.calcularTotal();
        
        pedido03.procesarPago(2500, MetodoDePago.PAYPAL); //no se necesita ingresar el email
        
        cliente03.notificarEstado();
    }
}
