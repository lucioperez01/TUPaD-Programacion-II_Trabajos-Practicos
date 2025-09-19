package reproductorcancionartista;
public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        setNombre(nombre);
        setGenero(genero);
    }

    private final void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
        }
    }

    private final void setGenero(String genero) {
        if(genero != null) {
            this.genero = genero;
        }
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }
}
