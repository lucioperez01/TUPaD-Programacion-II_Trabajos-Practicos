package gestionuniversidad;
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        setCodigo(codigo);
        setNombre(nombre);
    }

    public void setCodigo(String codigo) {
        if( codigo != null ) {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if( nombre != null) {
            this.nombre = nombre; 
        }
    }

    public void setProfesor(Profesor profesor) {
        if( profesor != null && this.profesor == null ){
            this.profesor = profesor;       // se agrega como atributo
            profesor.agregarCursos(this);   // se agrega a los cursos del profesor
            
        } else if (profesor != null && this.profesor != null) {
            this.profesor.eliminarCurso(this);      // se elimina el profesor anterior
            this.profesor = profesor;           // se setea el nuevo profe
            this.profesor.agregarCursos(this);  // se agrega el curso desde el profe
        }
    }
    
    // getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "Curso{" + " nombre=" + nombre + ", profesor=" + profesor + '}';
    }
}
