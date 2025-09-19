package impuestocontribuyente;
public class Contribuyente {
    private String nombre;
    private long cuil;

    public Contribuyente(String nombre, long cuil) {
        setNombre(nombre);
        setCuil(cuil);
    }
    
    //setters
    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", cuil=" + cuil + '}';
    }
}
