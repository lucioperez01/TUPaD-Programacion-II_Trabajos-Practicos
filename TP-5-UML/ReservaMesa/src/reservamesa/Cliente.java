package reservamesa;
public class Cliente {
    private String nombre;
    private long telefono;

    public Cliente(String nombre, long telefono) {
        setNombre(nombre);
        setTelefono(telefono);
    }

    private final void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
        }
    }

    private final void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
}
