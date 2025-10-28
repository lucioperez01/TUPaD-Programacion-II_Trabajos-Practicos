package ecommerse;
import java.util.ArrayList;

public class Pedido implements Pagable, Pago, PagoConDescuento, Notificable{
    private String id;
    private ArrayList<Producto> productos;
    private EstadoPago estado;
    private Cliente cliente;
    private double total;
    private MetodoDePago metodoDePago;
    

    public Pedido(String id, Cliente cliente) {
        setId(id);
        setCliente(cliente);
        this.productos = new ArrayList<>();
    }

    private final void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    private final void setCliente(Cliente cliente) {
        if(cliente != null) {
            this.cliente = cliente;
            this.cliente.agregarPedido(this);
        }
    }
    
    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
            this.total = calcularTotal();
        } else {
            System.out.println("Error: Ingrese un producto valido.");
        }
    }
    
    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }
    

    public EstadoPago getEstado() {
        return estado;
    }
    
    @Override
    public double calcularTotal() {
        double suma = 0;
        for (Producto producto : productos) {
            suma += producto.calcularTotal();
        }
        this.total = suma;
        this.estado = estado.PENDIENTE;
        return suma;
    }

    @Override
    public void procesarPago(double monto, MetodoDePago metodoDePago) {
        if (monto > 0 && metodoDePago != null) {
            double diferencia = this.total - monto;
            if (diferencia <= 0) {
                System.out.println("\nPagando...");
                
                int i = 0;
                while ( i < productos.size()) {
                    productos.remove(i);
                }
                this.total = calcularTotal();
                
                
                metodoDePago.pagar(this.cliente);
                
                this.estado = EstadoPago.PAGADO; 
                this.cliente.getPedido().estado = EstadoPago.PAGADO;
                notificarEstado();
            } else {
                System.out.println("Fondos insuficientes");
                this.estado = estado.PENDIENTE;
                notificarEstado();
            }
        }
    }
    @Override
    public double aplicarDescuento( double descuento) {
        double precioAnterior = this.total;
        if(descuento > 0 && descuento < 100){
            descuento = 1 - (descuento / 100);
            this.total *= descuento;
            System.out.print("\nPedido actualizado");
            mostrarTicket();
            System.out.println("\nSe aplico un descuento en su compra!" + "\nPrecio anterior: " + precioAnterior + "$" + "\nPrecio Actual: " + total + "$");
        }
        return this.total;
    }
    
    public void mostrarTicket() {
        System.out.println("\n\n*****************************************");
        for (Producto producto : productos) {
            System.out.println("Producto " + producto.getNombre() + ": " + producto.calcularTotal() + "$");
        }
        System.out.println("-------------------------");
        System.out.println("Total: " + this.getTotal());
        
        System.out.println("*****************************************");
            
    }

    @Override
    public void notificarEstado() {
        System.out.println("El estado del pedido se encuentra: " + this.getEstado());
    }
}
