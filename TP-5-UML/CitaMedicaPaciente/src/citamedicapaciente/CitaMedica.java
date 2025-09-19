package citamedicapaciente;
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    //constructor
    public CitaMedica(String fecha, String hora) {
        setFecha(fecha);
        setHora(hora);
    }

    //setters
    private final void setFecha(String fecha) {
        if(fecha != null) {
            this.fecha = fecha;
        }
    }

    private final void setHora(String hora) {
        if(hora != null) {
            this.hora = hora;            
        }
    }

    //asociacion unidireccional
    public void setPaciente(Paciente paciente) {
        if(paciente != null) {
            this.paciente = paciente;
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
    //asociacion unidireccional
    public void setProfesional(Profesional profesional) {
        if(profesional != null) {
            this.profesional = profesional;
        }
    }

    public Profesional getProfesional() {
        return profesional;
    }
    
    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profesional=" + profesional + '}';
    }
}
