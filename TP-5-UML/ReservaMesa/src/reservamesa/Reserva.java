package reservamesa;
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    

    public Reserva(String fecha, String hora, Mesa mesa) {
        setFecha(fecha);
        setHora(hora);
        setMesa(mesa);
    }

    private final void setFecha(String fecha) {
        if(fecha != null) {
            this.fecha = fecha;
        }
    }

    private final void setHora(String hora) {
        if(hora != null) {
        this.hora = hora;
        }
    }

    //asociacion unidireccional
    public void setCliente(Cliente cliente) {
        if(cliente != null) {
        this.cliente = cliente;
        }
    }

    private final void setMesa(Mesa mesa) {
        if(mesa != null) {
            this.mesa = mesa;
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }
}
