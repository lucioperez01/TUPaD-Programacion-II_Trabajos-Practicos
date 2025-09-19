package generadorqrusuario;
public class Usuario {
    private String nombre;
    private String email;

    //constructor
    public Usuario(String nombre, String email) {
        setNombre(nombre);
        setEmail(email);
    }

    //setters
    private final void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private final void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
}
