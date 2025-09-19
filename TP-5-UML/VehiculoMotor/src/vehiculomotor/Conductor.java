package vehiculomotor;
public class Conductor {
    private String nombre;
    private long licencia;
    private Vehiculo vehiculo;
    
    //constructor
    public Conductor(String nombre, long licencia) {
        setNombre(nombre);
        setLicencia(licencia);
    }

    //setter
    private final void setNombre(String nombre) {
        if(nombre != null){
        this.nombre = nombre;
        }
    }

    private final void setLicencia(long licencia) {
        this.licencia = licencia;
    }
    
    //asociacion bidireccional
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if(vehiculo != null && this.vehiculo.getConductor() != this){
            this.vehiculo.setConductor(this);
        }
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + '}';
    }
}
