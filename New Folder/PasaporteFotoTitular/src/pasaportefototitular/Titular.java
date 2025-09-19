package pasaportefototitular;
public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;

    //constructor
    public Titular(String nombre, int dni) {
        setNombre(nombre);
        setDni(dni);
    }
    
    //setters
    private final void setNombre(String nombre) {
        if(nombre != null) {
        this.nombre = nombre;   
        }
    }

    private final void setDni(int dni) {
        this.dni = dni;
    }
    
    //referencia a Pasaporte - asociacion bidireccional
    public final void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if(pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this); 
        }
    }

    //getters
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    //toString
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}
