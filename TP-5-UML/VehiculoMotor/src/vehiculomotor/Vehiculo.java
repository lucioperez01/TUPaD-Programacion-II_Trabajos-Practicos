package vehiculomotor;
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    //constructor
    public Vehiculo(String patente, String modelo, Motor motor) {
        setPatente(patente);
        setModelo(modelo);
        setMotor(motor);
    }

    //setters
    private final void setPatente(String patente) {
        if(patente != null){
            this.patente = patente;
        }
    }

    private final void setModelo(String modelo) {
        if(modelo != null){
        this.modelo = modelo;
        }
    }
    
    //agregacion
    private final void setMotor(Motor motor) {
        if(motor != null) {
            this.motor = motor; 
        }
    }
    
    //asociacion bidireccional
    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null && this.conductor.getVehiculo() != this){
            this.conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
}
