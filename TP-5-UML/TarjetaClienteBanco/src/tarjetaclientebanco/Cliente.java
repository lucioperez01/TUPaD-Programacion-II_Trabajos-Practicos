package tarjetaclientebanco;
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, int dni) {
        setNombre(nombre);
        setDni(dni);
    }

    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private final void setDni(int dni) {
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if(tarjetaDeCredito != null && this.tarjetaDeCredito.getCliente() != this){
            this.tarjetaDeCredito.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}
