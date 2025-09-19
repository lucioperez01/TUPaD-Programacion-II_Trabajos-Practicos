package tarjetaclientebanco;
public class TarjetaDeCredito {
    private int numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(int numero, String fechaVencimiento, Banco banco) {
        setNumero(numero);
        setFechaVencimiento(fechaVencimiento);
        setBanco(banco);
    }

    private final void setNumero(int numero) {
        this.numero = numero;
    }

    private final void setFechaVencimiento(String fechaVencimiento) {
        if(fechaVencimiento != null) {
        this.fechaVencimiento = fechaVencimiento;
        }
    }
    
    private final void setBanco(Banco banco){
        if(banco != null){
            this.banco = banco;
        }
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && this.cliente.getTarjetaDeCredito() != this){
            this.cliente.setTarjetaDeCredito(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + '}';
    }
}
