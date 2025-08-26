package registrodeestudiantes;
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    //Setters ↓--------------------------------------------
    public void setNombre (String nuevoNombre) {
        if (nuevoNombre != null) {  //si el nuevo nombre no es null
            nombre = nuevoNombre;
        }
    }
    
    public void setApellido(String nuevoApellido) {
        if (nuevoApellido != null) {
            apellido = nuevoApellido;
        }
    }
    
    public void setCurso(String nuevoCurso) {
        if (nuevoCurso != null) {
            curso = nuevoCurso;
        }
    }
    
    public void setCalificacion (double nuevaCalificacion) {
        if (nuevaCalificacion > 0.0) {
            calificacion = nuevaCalificacion;
        }
    }
    
    public double subirCalificacion(double puntos) {
        return calificacion = calificacion + puntos;
    }
    
    public double bajarCalificacion (double puntos) {
        return calificacion = calificacion - puntos;
    }
    
    // Getters ↓ -------------------------------------------
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nApellido: "+ apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion + "\n------------------------");
    }
}
