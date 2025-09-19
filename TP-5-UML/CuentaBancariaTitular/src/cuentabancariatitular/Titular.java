package cuentabancariatitular;
public class Titular {
    private String nombre;
    private long dni;
    private CuentaBancaria cuentaBancaria;

    //constructor
    public Titular(String nombre, long dni) {
        setNombre(nombre);
        setDni(dni);
    }
    
    //setters
    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    //asociacion bidireccional

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria != null && this.cuentaBancaria.getTitular() != this){
            this.cuentaBancaria.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    } 
}
