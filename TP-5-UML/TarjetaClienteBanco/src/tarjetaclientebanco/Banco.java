package tarjetaclientebanco;
public class Banco {
    private String nombre;
    private int cuit;

    public Banco(String nombre, int cuit) {
        setNombre(nombre);
        setCuit(cuit);
    }

    private final void setNombre(String nombre) {
        if(nombre != null){
        this.nombre = nombre;
        }
    }

    private final void setCuit(int cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }

}
