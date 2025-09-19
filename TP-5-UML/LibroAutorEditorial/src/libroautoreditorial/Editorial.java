package libroautoreditorial;
public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        setNombre(nombre);
        setDireccion(direccion);
    }

    //getters & setters
    public String getNombre() {
        return nombre;
    }

    private final void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
        }
    }

    private final void setDireccion(String direccion) {
        if(direccion != null){
            this.direccion = direccion;
        }
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
}
