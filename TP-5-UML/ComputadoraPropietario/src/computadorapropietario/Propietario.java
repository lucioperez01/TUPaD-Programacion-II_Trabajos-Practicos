package computadorapropietario;
public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        setNombre(nombre);
        setDni(dni);
    }
    
    private final void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
        }
    }

    private final void setDni(int dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if(computadora != null && this.computadora.getPropietario() != this) {
            this.computadora.setPropietario(this);
        }
    } 

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}
