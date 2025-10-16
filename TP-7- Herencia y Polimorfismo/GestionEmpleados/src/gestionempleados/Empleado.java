package gestionempleados;
public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        setNombre(nombre);
    }
    
    public void setNombre(String nombre) {
        if ( nombre != null ){
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    //polimorfismo
    public abstract double calcularSueldo();
}
