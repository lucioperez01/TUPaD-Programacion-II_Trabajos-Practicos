package libroautoreditorial;
public class Autor {
    private String nombre;
    private String nacionalidad;
    
    //constructor
    public Autor(String nombre, String nacionalidad) {
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }

    //getters and setters
    private final void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;    
        }
    }

    private final void setNacionalidad(String nacionalidad) {
        if(nacionalidad != null){
        this.nacionalidad = nacionalidad;
        }
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
}
