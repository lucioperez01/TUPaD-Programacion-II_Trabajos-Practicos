package registrodemascotas;
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
     
    //setters ↓ ----------------------------------
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null) {
            nombre = nuevoNombre;
        }
    }
    
    public void setEspecie(String nuevaEspecie ) {
        if (nuevaEspecie != null) {
            especie = nuevaEspecie;
        }
    }
    
    public int cumplirAnios(int anios) {
        if (edad >= 0 && edad <= 100) {
            edad += anios;
        }
        return edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad + "\n---------------");
    }
}
