package citamedicapaciente;
public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        setNombre(nombre);
        setObraSocial(obraSocial);
    }

    
    private final void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;   
        }   
    }

    private final void setObraSocial(String obraSocial) {
        if(obraSocial != null) {
            this.obraSocial = obraSocial;
        }   
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
    }
}
