package bibliotectagestion;
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    public Autor(String id, String nombre, String nacionalidad) {
        setId(id);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }
    
    public final void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public final void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public final void setNacionalidad(String nacionalidad) {
        if(nacionalidad != null) {
            this.nacionalidad = nacionalidad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
}
