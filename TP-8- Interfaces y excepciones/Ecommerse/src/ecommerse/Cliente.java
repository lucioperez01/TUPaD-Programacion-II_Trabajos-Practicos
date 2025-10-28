package ecommerse;
import java.util.ArrayList;

public class Cliente implements Notificable {
    private String nombre;
    private int dni;
    private Pedido pedido;
    private MetodoDePago metodoDePago;

    public Cliente(String nombre, int dni) {
        setNombre(nombre);
        setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    
    public void agregarPedido(Pedido pedido) {
        if( pedido != null ) {
            this.pedido = pedido;
        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }
    
    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public void notificarEstado() {
            System.out.println( "\n Resumen de su estado como cliente: \n  -Pedido id = " + this.pedido.getId() + "\n    -Estado: " + this.pedido.getEstado() + "\n     -Total: " + this.pedido.getTotal() );
        
    }
}
