package citamedicapaciente;
public class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

    private final void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;    
        }
    }

    private final void setEspecialidad(String especialidad) {
        if(especialidad != null){
            this.especialidad = especialidad;
        }
    }

    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
}
