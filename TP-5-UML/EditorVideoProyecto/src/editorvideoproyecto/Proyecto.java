package editorvideoproyecto;
public class Proyecto {
    private String nombre;
    private int duracionMin;

    // cobstructor
    public Proyecto(String nombre, int duracionMin) {
        setNombre(nombre);
        setDuracionMin(duracionMin);
    }
    
    // setters
    private final void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
        }
    }

    private final void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }
}
