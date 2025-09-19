package celularbareria;
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
    
    //constructor
    public Usuario(String nombre, int dni) {
    setNombre(nombre);
    setDni(dni);
}
    
    // setters
    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        if(celular != null){
            this.celular = celular;
        }
    }
    
    public Celular getCelular(){
        return celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + '}';
    }
}
